package matricularalunos;

/**
 *
 * @author lpmel
 */
public class Turmas {

    private String nomecurso;
    private int TotalAulas;
    private Aluno list[];
    private int count;

    //Construtor parametrizado
    public Turmas(String nc, int ta, int capMax) {
        if (capMax <= 20) {
            this.nomecurso = nc;
            this.TotalAulas = ta;
            list = new Aluno[capMax];
            this.count = 0;
        } else {
            throw new ExceptionArrayLotado();
        }
    }

    //Métodos
    public void matricularAluno(Aluno al) {
        if (count >= list.length || count > 20) {
            throw new ExceptionArrayLotado();
        } else {
            for (int i = 0; i < count; i++) {
                if (list[i].getCodigo() == al.getCodigo()) {
                    throw new ExceptionCodigoExistente();
                }
            }
            list[count] = al;
            count++;
        }
    }

    public int buscarAluno(int codigo) {
        boolean existe = false;
        for (int i = 0; i < count; i++) {
            if (list[i].getCodigo() == codigo) {
                existe = true;
                System.out.println("O indice que ele se encontra é:[" + i + "]");
                return i;
            }
        }
        if (existe == false) {
            System.out.println("Não foi encontrado aluno com este código.");
            return -1;
        }
        return -1;
    }

    public void registrarFalta(int codigo) {
        boolean existe = false;
        for (int i = 0; i < count; i++) {
            if (list[i].getCodigo() == codigo) {
                existe = true;
                list[i].setQtdFaltas(list[i].getQtdFaltas() + 1);
            }
        }
        if (existe == false) {
            throw new ExceptionCodigoNaoExistente();
        }

    }

    public void atribuirMedia(int codigo, double media) {
        boolean existe = false;
        if (media >= 0 || media < 10) {
            for (int i = 0; i < count; i++) {
                if (list[i].getCodigo() == codigo) {
                    existe = true;
                    list[i].setMedia(media);
                }
            }
            if (existe == false) {
                throw new ExceptionCodigoNaoExistente();
            }

        } else {
            System.out.println("Por favor, insira valores para média de apenas 0 à 10!");
        }
    }

    public void listarTodos() {
        System.out.println("Lista de todos os alunos do curso: "+nomecurso);
        for (int i = 0; i < count; i++) {
            {
                list[i].imprimeDados();
            }
        }
    }

    public void listarAprovados() {
        System.out.println("Lista de aprovados do curso: "+nomecurso);
        for (int i = 0; i < count; i++) {
            if (((list[i].getQtdFaltas()* 100) / TotalAulas) <= 75 && list[i].getMedia() >= 6) {
                list[i].setAprovado(true);
            }
        }
        for (int j = 0; j < count; j++) {
            if(list[j].isAprovado()){
                list[j].imprimeDados();
            }
        }
    }
}
