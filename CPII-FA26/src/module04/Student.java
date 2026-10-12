/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module04;

/**
 *
 * @author RLAL
 */
public class Student {
    // Attributes
    private String name;
    private double gpa;
    
    // No-arg Constructor
    public Student(){
        name = "Unknown";
        gpa = 0.5;
    }
    // Parameterized Constructor
    public Student(String nameIn, double gpaIn){
        name = nameIn;
        gpa = gpaIn;
    }
    
    public Student(String nameIn){
        name = nameIn;
    }
    
    @Override
    public String toString(){
        return name+", "+gpa;
    }
}
