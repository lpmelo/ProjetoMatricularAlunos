package matricularalunos;

/**
 *
 * @author lpmel
 */
public class ExceptionCodigoExistente extends RuntimeException{
    
    @Override
    public String toString(){
        return "O Código já existe";
    }
    
}
