package LibraryItemClasses;

import Exceptions.DissertationBorrowedException;
import UserClasses.Student;


public class Dissertation extends LibraryItem {
    private String course;
    
    public Dissertation(int itemId, String author, int year, String title, int addedBy, Student assignedStudent, String course){
        super(itemId, author, year, title, addedBy, assignedStudent);
        this.course = course;  
    }
    
    public String getCourse(){
    return course;
    }
    
    public void setCourse(String course){
    this.course = course;
    }
    
    @Override
    public String toString(){
    return super.toString() + " \n Course Name of Dissertation: " + course;
    }

    @Override
    public void checkoutItem(Student student) {
        if(student.isCardSubmitted() == true){
          throw new DissertationBorrowedException("You can only borrow 1 dissertation at a time");
        }
        
        else if (student.isCardSubmitted() == false){
        student.setSubmissionStatus(true);
        }
     
    }

    @Override
    public void returnItem(Student student) {
        student.setSubmissionStatus(false);
         
    }
    
}
