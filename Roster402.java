// =====================================================
// 
//  This program is an assignment for my intermediate 
//  Java class. The goal of the program is to create 
//  methods to sort through a LinkedList of 15 Student
//  objects. The registrar must be able to sort either
//  by student last name or student id number. 
//
// =====================================================

import java.util.*;

// Main Class
public class Roster402 {

    // User Input
    static Scanner sc = new Scanner(System.in);

    // Displays the student objects
    private static void displayStudents(LinkedList ll){
        StringBuilder output = new StringBuilder();

        // Display each Linked List element
        for (int i = 0; i < ll.size(); i++){
            output.append(ll.get(i)).append("\n");
        }

        System.out.println(output);
    }

    // Sorts the student objects by ID number
    private static void sortID(LinkedList ll) {
        ll.sort(Comparator.comparing(Student:: getID));
    }

    // Sorts the student objects by last name
    private static void sortName(LinkedList ll) {
        ll.sort(Comparator.comparing(Student:: getLName));
    }

    // Gets the user input
    private static int getInput() {
        int input;

        do {
            System.out.println("How would you like to sort?");
            System.out.println("1. By last name");
            System.out.println("2. By student ID");
            System.out.println("3. Exit");
            input = sc.nextInt();
        } while (input < 1 && input > 3);
        
        return input;
    }

    // main sort method
    private static void sort(int input, LinkedList ll){

        switch(input){
            case 1: // sort by last name
                System.out.print("\n");
                sortName(ll);
                break;
            case 2: // sort by student ID
                System.out.print("\n");
                sortID(ll);
                break;
            case 3: // Exit
                System.exit(0);
        }
    }
    // Main class
    public static void main(String[] args){

        int input;

        // Student objects
        Student Gabriel = new Student("Avinaz", "Gabriel", 11);
        Student Joshua = new Student("Bartlett", "Joshua", 25);
        Student Chaim = new Student("Brisk", "Chaim", 63);
        Student Brice = new Student("Widger", "Brice", 26);
        Student Wesley = new Student("Corrick", "Wesley", 22);
        Student Christian = new Student("Muniz-Torres", "Christian", 31);
        Student David = new Student("Freer", "David", 86);
        Student Mamoud = new Student("Keita", "Mamoud", 87);
        Student Jason = new Student("Staley", "Jason", 30);
        Student Gary = new Student("Lam", "Gary", 49);
        Student Daniel = new Student("Lara", "Daniel", 12);
        Student Miguel = new Student("Maya Cigarroa", "Miguel", 74);
        Student Shawn = new Student("McAllister", "Shawn", 23);
        Student Martin = new Student("Seigel", "Martin", 13);
        Student James = new Student("Verderamo", "James", 42);
        
        // Adding student objects
        LinkedList<Object> rosterLL = new LinkedList();
        rosterLL.add(Gabriel);
        rosterLL.add(Joshua);
        rosterLL.add(Chaim);
        rosterLL.add(Wesley);
        rosterLL.add(David);
        rosterLL.add(Mamoud);
        rosterLL.add(Gary);
        rosterLL.add(Daniel);
        rosterLL.add(Miguel);
        rosterLL.add(Shawn);
        rosterLL.add(Christian);
        rosterLL.add(Martin);
        rosterLL.add(Jason);
        rosterLL.add(James);
        rosterLL.add(Brice);

        // Main logic
        do {
            input = getInput();
            sort(input, rosterLL);
            displayStudents(rosterLL);
        } while (input == 1 || input == 2);
        
    } 
}