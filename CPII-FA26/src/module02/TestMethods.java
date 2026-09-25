/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module02;

/**
 *
 * @author rlal
 */
public class TestMethods {
    // write a static method for adding of two integers
    public static int sum(int x, int y){
        return x+y;
    }
    
    public static int sum(int x, int y, int z){
        return x+y+z;
    }
    
     public static double sum(double x, double y){
        return x+y;
    }
    
    public static void main(String[] args){
        System.out.println(TestMethods.sum(5, 15, 12));
        System.out.println(TestMethods.sum(5, 12));      
    }
}
