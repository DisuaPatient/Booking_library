package LibraryItemClasses;

import UserClasses.Student;
import java.util.ArrayList;

public abstract class LibraryItem {
    private int itemId;
    private String author;
    private int year;
    private String title;
    private int addedBy;
    private Student assignedStudent = null;
    public static ArrayList<LibraryItem> items = new ArrayList<>();
    public static ArrayList<LibraryItem> borrowedItems = new ArrayList<>();
    
    public LibraryItem(int itemId, String author, int year, String title, int addedBy, Student assignedStudent){
    this.itemId = itemId;
    this.author = author;
    this.year = year;
    this.title = title;
    this.addedBy = addedBy;
    this.assignedStudent = assignedStudent;
    }
    
    public int getItemId(){
    return itemId;
    }
    
    public void setItemId(int itemId){
    this.itemId = itemId;
    }
    
    public String getAuthor(){
    return author;
    }
    
    public void setAuthor(String author){
    this.author = author;
    }
    
    public int getYear(){
    return year;
    }
    
    public void setYear(int year){
    this.year = year;
    }
    
    public String getTitle(){
    return title;
    }
    
    public void setTitle(String title){
    this.title = title;
    }
    
    public int getAddedBy(){
    return addedBy;
    }
    
    public void setAddedBy(int addedBy){
    this.addedBy = addedBy;
    }
    
    public Student getAssignedStudent(){
    return assignedStudent;
    }
    
    public void setAssignedStudent(Student assignedStudent){
    this.assignedStudent = assignedStudent;
    }
    
    public abstract void checkoutItem(Student student);
    
    public abstract void returnItem(Student student);
    
    
    
    @Override
    public String toString(){
    return " ID of Item: " + itemId 
            + " Author: " + author 
            + " Year of Publication: " + year
            + " Title: " + title 
            + " Adder ID: " + addedBy;
            
    }
}
