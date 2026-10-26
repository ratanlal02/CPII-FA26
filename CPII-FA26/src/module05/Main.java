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
    
        Calculator<Integer, Double> objCal = new Calculator<>(new Integer(5), new Double(6.5));
        System.out.println(objCal.getDataOne());
        System.out.println(objCal.getDataTwo());
    }
}
