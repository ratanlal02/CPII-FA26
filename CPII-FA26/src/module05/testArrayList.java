/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module05;

import java.util.ArrayList;

/**
 *
 * @author rlal
 */
public class testArrayList {
    public static void main(String[] args){
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(1);
        numList.add(3);
        numList.add(5);
        numList.add(7);
        numList.add(9);
        numList.add(1, 2);
        
        for(Integer x: numList){
            System.out.print(x+" ");
        }
        System.out.println("");
        numList.remove(2);
        for(int i = 0; i < numList.size(); i++){
            System.out.print(numList.get(i)+" ");
        }
        System.out.println("");
        numList.set(1, 3);
        for(Integer x: numList){
            System.out.print(x+" ");
        }
        System.out.println("");
        // Create an object named fruitList of ArrayList
        // of String
        ArrayList<String> fruitList = new ArrayList<>();
        // Add Banana, Apple, Strawberry
        fruitList.add("Banana");
        fruitList.add("Apple");
        fruitList.add("Strawberry");
        
        // Print the fruitList
        for(String fruit: fruitList){
            System.out.print(fruit+" ");
        }
        
        // Add your new favourite fruit at first in the list
        fruitList.add(0, "Grapes");
        System.out.println("");
        // Print the fruitList
        for(String fruit: fruitList){
            System.out.print(fruit+" ");
        }
        // Remove your least favourite fruit
        fruitList.remove(fruitList.size()-1);
        System.out.println("");
        // Print the fruitList
        for(String fruit: fruitList){
            System.out.print(fruit+" ");
        }
        System.out.println("");
        // Get your second favourite fruit
        System.out.println(fruitList.get(1));
        
        // Change our top favourite fruit to Mango
        fruitList.set(0, "Mango");
        
        // Print the fruitList
        for(String fruit: fruitList){
            System.out.print(fruit+" ");
        }
    
    }
}
