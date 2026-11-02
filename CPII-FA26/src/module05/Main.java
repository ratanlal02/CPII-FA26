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
    
        Calculator<Integer, Integer> objCal;
        objCal = new Calculator<>(5, 5);
        System.out.println(objCal.getDataOne());
        System.out.println(objCal.getDataTwo());
        System.out.println(objCal.add());
    }
}
