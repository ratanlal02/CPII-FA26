/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module01;

import java.util.Scanner;

/**
 *
 * @author RLAL
 */
public class TestSwitch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your semester:");
        String sem = input.next();
        
        switch(sem){
            case "Fall":
                System.out.println("This is good semester!");
                break;
            case "Spring":
                System.out.println("This is an Okay semester!");
                break;
            default:
                System.out.println("Wrong semester!");
            case "Summer":
                System.out.println("This is a fantastic semester!");
                break;

        }
        
        System.out.print("Enter your first number:");
        int numOne = input.nextInt();
         System.out.print("Enter your second number:");
        int numTwo = input.nextInt();
        System.out.print("Enter +/A/ADD for addition, -/S/MINUS for substraction:");
        String op = input.next();
        String op1 = op.toUpperCase();
        switch(op1){
            case "+", "A", "ADD" -> System.out.println("Sum is: "+ (numOne+numTwo));
            case "-", "S", "MINUS" -> System.out.println("Sum is: "+ (numOne-numTwo));
        }
        
        
    }
}
