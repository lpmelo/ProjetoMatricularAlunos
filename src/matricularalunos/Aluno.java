package matricularalunos;

/**
 *
 * @author lpmel
 */
public class Aluno {
    private int codigo;
    private String nomealuno;
    private double media;
    private int qtdFaltas;
    private boolean Aprovado;
    
    //Construtor parametrizado
    public Aluno(int cod, String nome, double md){
        this.codigo = cod;
        this.nomealuno = nome;
        this.media= md;
        this.qtdFaltas = 0;  
        this.Aprovado=false;
    }
    
    //Getter's e Setter's

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean isAprovado() {
        return Aprovado;
    }

    public void setAprovado(boolean Aprovado) {
        this.Aprovado = Aprovado;
    }

    public String getNomealuno() {
        return nomealuno;
    }

    public void setNomealuno(String nomealuno) {
        this.nomealuno = nomealuno;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public int getQtdFaltas() {
        return qtdFaltas;
    }

    public void setQtdFaltas(int qtdFaltas) {
        this.qtdFaltas = qtdFaltas;
    }
    
    //Método de print
    public void imprimeDados()
    {
        System.out.println("Código: "+codigo+ "| Nome: " + nomealuno + "| Média: " + media + "| Quantidade de Faltas: "+ qtdFaltas);
    }
}
