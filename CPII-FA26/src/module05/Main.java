/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module05;

/**
 *
 * @author rlal
 */
public class Main {
    public static void main(String[] args){
    
//        Calculator<Integer, Integer> objCal;
//        objCal = new Calculator<>(5, 5);
//        System.out.println(objCal.getDataOne());
//        System.out.println(objCal.getDataTwo());
//        System.out.println(objCal.add());

        Employee emp = new Employee("X", "Y", "3245325");
        Employee emp2 = new Employee("A", "B", "3245325");
        System.out.println(emp.SSN);
        HourlyEmployee hrEmp = new HourlyEmployee("A", "B", "3245325", 20, 50);
        System.out.println(hrEmp.SSN);
        System.out.println(hrEmp.calculateWeeklySalary());
        System.out.println(hrEmp.getFullName());
        System.out.println(emp instanceof Employee);
        System.out.println(emp instanceof HourlyEmployee);
        System.out.println(emp instanceof Object);
        
        Employee emp1 = emp;
        System.out.println(emp1 instanceof Employee);
        System.out.println(emp1 instanceof HourlyEmployee);
        System.out.println(emp1 instanceof Object);
        
        Object o = new Object();
        System.out.println(emp.equals(o));

        
                  
    }
}
