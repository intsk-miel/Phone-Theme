package exceptions;

public class InvalidNumberException extends Exception{
    public InvalidNumberException(){
        super("Invalid PinCode! Try Again");
    }
    public InvalidNumberException(String message){
        super(message);
    }
}

