package UserClasses;


public class Librarian extends User {
    
     public Librarian(int userId, String firstName, String lastName, int registeredBy, int year){
        super(userId, firstName, lastName, registeredBy, year);
    }
     
     @Override
     public String toString(){
     return super.toString();
     }
    
}
