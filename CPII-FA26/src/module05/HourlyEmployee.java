/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module05;

/**
 *
 * @author RLAL
 */
public class HourlyEmployee extends Employee implements EmployeeService{
    private double hourlyRate;
    private int hrsWorked;

    public HourlyEmployee(String firstName, String lastName,
            String SSN, double hourlyRate, int hrsWorked) {
        super(firstName,lastName, SSN);
        this.hourlyRate = hourlyRate;
        this.hrsWorked = hrsWorked;
    }
    
    @Override
    public double calculateWeeklySalary(){
	double overtime = 0.0;
	if (hrsWorked > 40){
		overtime = (hrsWorked - 40)*
                        (0.5 * hourlyRate);
	}
	return overtime + hrsWorked * hourlyRate;
    }
    
    @Override
    public  String toString(){
        return super.toString()+", "+hrsWorked+", "+hourlyRate;
    }
}
