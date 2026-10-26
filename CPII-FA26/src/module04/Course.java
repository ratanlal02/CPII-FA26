/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module04;

/**
 *
 * @author rlal
 */
public class Course {
    private String courseName;
    private String[] students;
    private int numberOfStudents;
    
    public Course(String courseName){
        this.courseName = courseName;
        students = new String[50];
        numberOfStudents = 0;
    }
    
    public String getCourseName(){
        return courseName;
    }
    
    public void addStudent(String student){
        students[numberOfStudents] = student;
        numberOfStudents += 1;
    }
    
    public void dropStudent(String student){
        // Find the index of student
        int index = -1;
        for (int i = 0; i < numberOfStudents; i++){
            if(students[i].equals(student)){
                index = i;
                break;
            }
        }
        for (int j = index+1; j < numberOfStudents; j++){
            students[j-1] = students[j];
        }
        students[numberOfStudents]= null;
        numberOfStudents -=1;   
    }
    
    public String[] getStudents(){
        return students;
    }
    
    public int getNumberOfStudents(){
        return numberOfStudents;
    }
}