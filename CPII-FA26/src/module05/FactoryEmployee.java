/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module05;

/**
 *
 * @author RLAL
 */
public class FactoryEmployee {
    
    public static EmployeeService getEmployee(String type){
        switch(type){
            case "Hourly":
                return new HourlyEmployee("A", "B", "3245325", 20, 50);
             
        }
        return null;
    }
}
