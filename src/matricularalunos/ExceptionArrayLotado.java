package matricularalunos;

/**
 *
 * @author lpmel
 */
public class ExceptionArrayLotado extends RuntimeException{
    
    @Override
    public String toString(){
        return "A turma já está com 20 alunos, ou atingiu o limite da turma definido pelo usuário!";
    }
    
}
