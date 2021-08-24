package matricularalunos;

/**
 *
 * @author lpmel
 */
public class MatricularAlunos {

    public static void main(String[] args) {
        //Tentar colocar mais de 20 alunos em um curso não é possível, vai acionar a ExceptionArrayLotado!
        Turmas Ads = new Turmas("ADS",20,2);
        //Caso matricular mais Alunos que a capacidade máxima da turma definida, também acionará ExceptionArrayLotado!
        //Caso tentar matricular um Aluno de código igual a outro inserido anteriormente, acionará ExceptionCodigoExistente!
        Ads.matricularAluno(new Aluno(1,"José",0));
        Ads.matricularAluno(new Aluno(2,"Mario",0));
        //Para os métodos: buscarAluno/atribuirMedia | Em caso de setar um código não existente na lista, acionará ExceptionCodigoNaoExistente!
        Ads.buscarAluno(3);
        Ads.atribuirMedia(2, 6);
        //Lista todos os cadastros dessa turma.
        Ads.listarTodos();
        //Lista apenas os aprovados dessa turma.
        Ads.listarAprovados();
        
        //Em caso de adicionar mais turmas segue o código: (Apenas remova ('/*'))
        /*
        Turmas SI = new Turmas("Segurança da Informação",20,2);
        SI.matricularAluno(new Aluno(1,"Claudio",0));
        SI.matricularAluno(new Aluno(2,"Lucas",0));
        SI.listarTodos();
        */
        
    }
    
}
