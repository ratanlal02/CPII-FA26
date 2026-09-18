/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module02;

import java.util.Scanner;

/**
 *
 * @author RLAL
 */
public class TestWhile {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean isItemOnCounter=true;
        System.out.print("Is there any item on counter?");
        isItemOnCounter = input.nextBoolean();
        System.out.println(isItemOnCounter);
        double sum = 0.0;
        while(isItemOnCounter){
            System.out.print("Enter the price of item:");
            sum += input.nextDouble();
            System.out.print("Is there any item on counter?");
            isItemOnCounter = input.nextBoolean();
        }
        System.out.println("Total price is "+sum);
        
    }
}
