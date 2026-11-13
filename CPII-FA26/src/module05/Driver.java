/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module05;

/**
 *
 * @author RLAL
 */
public class Driver {
    public static void main(String[] args){
    
        I1 a = new A();
        System.out.println(a.foo(5));
        EmployeeService emp1 = FactoryEmployee.getEmployee("Hourly");
        System.out.println(emp1.calculateWeeklySalary());
        HourlyEmployee hrEmp = new HourlyEmployee("A", "B", "3245325", 20, 50);
        Employee emp = hrEmp;
        Object o = new Object();
        HourlyEmployee hrEmp1 = (HourlyEmployee)emp;
        
        
    }
}
