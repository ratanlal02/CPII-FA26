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
public class TestSelection {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your semester:");
        String sem = input.next();
        if(sem.equals("Fall")){
            System.out.println("This is a good semester");
        }
        else if (sem.equals("Spring")){
            System.out.println("This is an Okay semester");
        }
        else if (sem.equals("Summer")){
             System.out.println("This is an exciting semester");       
        }
        else{
            System.out.println("Input is wrong");
        }
        System.out.print("Enter your score:");
        int score = -1;
        if(input.hasNextInt())
            score = input.nextInt();
        if (score > 100){
            System.out.println("Invalid score");
        }
        else if(score >= 90){
            System.out.println("A");
        }
        else if (score>= 80){
            System.out.println("B");
        }
        else if (score >=70){
            System.out.println("C");
        }
        else if (score >= 60){
            System.out.println("D");
        }
        else if (score >= 0){
            System.out.println("F");
        }
        else{
            System.out.println("Invalid score");
        }
        
        
    }
}
