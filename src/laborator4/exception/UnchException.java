package laborator4.exception;

public class UnchException extends RuntimeException { //extinde Runtime pentru ca este neverificata
    public UnchException(String message){
        super("UnchException" + message);
    }
}
