/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module05;

/**
 *
 * @author RLAL
 */
public class Employee {
    private String firstName;
    private String lastName;
    protected String SSN;

//    public Employee(){
//        firstName = "Unknown";
//        lastName = "Unknown";
//        SSN = "Unknown";
//    }
    public Employee(String firstName, String lastName, String SSN) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
    }
    
    public String getFullName(){
        return lastName+", "+firstName;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSSN() {
        return SSN;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }
    
    @Override
    public  String toString(){
        return firstName+", "+lastName+", "+SSN;
    }
    
    @Override
    public boolean equals(Object O){
        Employee emp=null;
        if (O instanceof Employee){
            emp = (Employee) O;
            if(SSN.equals(emp.getSSN()))
                return true;
            else 
                return false;
        }
        else
            return false;
    }
    
}
