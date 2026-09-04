/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module01;

import java.util.Scanner;

/**
 *
 * @author rlal
 */
public class TestScanner {
    public static void main(String[] args){
        // Create an object of the Scanner class
        Scanner scan = new Scanner(System.in);
        // Prompt for user to enter the first name
        System.out.print("Enter your first name:");
        String firstName = scan.next();
        System.out.print("Enter your last name:");
        scan.nextLine();
        String lastName = scan.nextLine();
        System.out.print("Enter your age:");
        int age = scan.nextInt();
        System.out.println("Name:"+lastName+", "+firstName);
        System.out.println("Age:"+age);
        
        // Create an object of the Scanner class
        
        // Write code for prompting username
        
        // Read username from input console
        
        // Write code for prompting password
       
        
        // Read password from input console
        
        
        // Print username and password entered by the user
        
    }
}
