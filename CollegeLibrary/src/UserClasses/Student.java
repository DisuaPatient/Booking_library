package UserClasses;


public class Student extends User {
    private boolean cardSubmitted = false;
    
    public Student(int userId, String firstName, String lastName, int registeredBy, int year, boolean cardSubmitted){
        super(userId, firstName, lastName, registeredBy, year);
        this.cardSubmitted = cardSubmitted;
    }
    
    public boolean isCardSubmitted(){
    return cardSubmitted;
    }
    
    public void setSubmissionStatus(boolean cardSubmitted){
    this.cardSubmitted = cardSubmitted;
    }
    
    @Override
    public String toString(){
    return super.toString() + " \n card submitted: " + cardSubmitted;
    }
}
