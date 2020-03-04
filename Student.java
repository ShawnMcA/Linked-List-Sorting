// =====================================================
// 
//  This program is an assignment for my intermediate 
//  Java class. The goal of the program is to create 
//  methods to sort through a LinkedList of 15 Student
//  objects. The registrar must be able to sort either
//  by student last name or student id number. 
//
// =====================================================

// Student class
public class Student {
    private String lName;
    private String fName;
    private int ID;

    // Constructor
    public Student(String lNme, String fNme, int id) {
        this.lName = lNme;
        this.fName = fNme;
        this.ID = id;
    }

    // Get first name
    public String getFName() {
        return this.fName;
    }

    // Set first name
    public void setFName(String newVal){
        this.fName = newVal;
    }

    // Get last name
    public String getLName(){
        return this.lName;
    }

    // Set last name
    public void setLName(String newVal){
        this.lName =  newVal;
    }

    // Get ID number
    public int getID(){
        return this.ID;
    }

    // Set ID number
    public void setID(int newVal){
        this.ID = newVal;
    }

    // Convert Object to string
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Student: ").append(this.lName).append(", ").append(this.fName).append(" ID: ").append(this.ID);
        return sb.toString();
    }
}