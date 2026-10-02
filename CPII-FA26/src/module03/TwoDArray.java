/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module03;

/**
 *
 * @author RLAL
 */
public class TwoDArray {
    public static void main(String[] args){
        // Scenario 1
        int[][] numbers = new int[4][5]; 
        for(int row=0; row < numbers.length; row++){
        
            for(int col=0; col < numbers[row].length; col++){
                numbers[row][col] = row + col;
            }
        }
        
        for(int row=0; row < numbers.length; row++){
            for(int col=0; col < numbers[row].length; col++){
                System.out.print(numbers[row][col]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        // Enhanced For Loop
        for(int[] oneD : numbers){
            for(int x: oneD){
                System.out.print(x+" ");
            }
            System.out.println("");
        }
        
    }
    
}
