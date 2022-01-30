package LibraryItemClasses;

import UserClasses.Student;


public class Book extends LibraryItem {
    private String publisher;
    
    public Book(int itemId, String author, int year, String title, int addedBy, Student assignedStudent, String publisher){
        super(itemId, author, year, title, addedBy, assignedStudent);
        this.publisher = publisher;
    }
    
    public String getPublisher(){
    return publisher;
    }
    
    public void setPublisher(String publisher){
    this.publisher = publisher;
    }
    
    @Override
    public String toString(){
    return super.toString() + " Publisher of Book: " + publisher;
    }

    @Override
    public void checkoutItem(Student student) {
        
    }

    @Override
    public void returnItem(Student student) {
          
    }
    
}
