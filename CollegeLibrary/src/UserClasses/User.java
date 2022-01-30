package UserClasses;

import java.util.ArrayList;

public abstract class User {
    private int userId;
    private String firstName;
    private String lastName;
    private int registeredBy;
    private int year;
    public static ArrayList<User> users = new ArrayList<>();
    
    public User(int userId, String firstName, String lastName, int registeredBy, int year){
    this.userId = userId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.registeredBy = registeredBy;
    this.year = year;
    }
    

    public int getUserId() {
        return userId;
    }

  
    public void setUserId(int userId) {
        this.userId = userId;
    }

  
    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public int getRegisteredBy() {
        return registeredBy;
    }

    public void setRegisteredBy(int registeredBy) {
        this.registeredBy = registeredBy;
    }
    

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    @Override
    public String toString(){
    return " ID: " + userId 
            + " \n First Name: " + firstName 
            + " \n Last Name: " + lastName 
            + " \n Registered By: " + registeredBy 
            + " \n Year of Employment/Enrolment: " + year;
    }
}
