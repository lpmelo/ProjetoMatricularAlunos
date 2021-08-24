package matricularalunos;

/**
 *
 * @author lpmel
 */
public class ExceptionCodigoNaoExistente extends RuntimeException{
    
    @Override
    public String toString(){
        return "O código informado não existe!";
    }
    
}
