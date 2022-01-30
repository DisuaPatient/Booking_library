package Exceptions;

public class DissertationBorrowedException extends RuntimeException {
    
    public DissertationBorrowedException(String text){
        super(text);
    }
}
