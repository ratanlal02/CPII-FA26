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
    
    public static void print2DArray(int[][] twoD){
        for(int row=0; row < twoD.length; row++){
            for(int col=0; col < twoD[row].length; col++){
                System.out.print(twoD[row][col]+" ");
            }
            System.out.println("");
        }
    }
    
    public static int sumOfARow(int[][] twoD, int row){
        int sum = 0;
        for(int col=0; col < twoD[row].length; col++) {
            sum += twoD[row][col];
        }
        return sum;
    }
    
    public static int sumOfACol(int[][] twoD, int col){
        int sum = 0;
        for(int row=0; row < twoD.length; row++){
            if(twoD[row].length > col)
                sum += twoD[row][col];
        }
        return sum;
    }
    
    public static int[][] makeDiagZero(int[][] twoD){
        int[][] temp = twoD.clone();
        for(int row = 0 ; row < temp.length; row++){
            temp[row][row] = 0;
        }
        return temp;
    }
    
    public static void main(String[] args){
        // Scenario 1
        int[][] numbers = new int[4][4]; 
        for(int row=0; row < numbers.length; row++){
        
            for(int col=0; col < numbers[row].length; col++){
                numbers[row][col] = row + col;
            }
        }
        
        
//        for(int row=0; row < numbers.length; row++){
//            for(int col=0; col < numbers[row].length; col++){
//                System.out.print(numbers[row][col]+" ");
//            }
//            System.out.println("");
//        }
        print2DArray(numbers);
        System.out.println("");
        // Enhanced For Loop
        for(int[] oneD : numbers){
            for(int x: oneD){
                System.out.print(x+" ");
            }
            System.out.println("");
        }
        
        // What is the sum of all the values in the row index 2
//        int sum = 0;
//        for(int col=0; col < numbers[2].length; col++) {
//            sum += numbers[2][col];
//        }
        int sum = sumOfARow(numbers, 2);
        System.out.println("sum is: "+ sum);
        
        // What is the sum of all the values in the 
        //column index 2
//        sum = 0;
//        for(int row=0; row < numbers.length; row++){
//            if(numbers[row].length > 2)
//                sum += numbers[row][2];
//        }
        sum = sumOfACol(numbers, 2);
        System.out.println("Sum is: "+ sum);
        // Write a function that returns the same array while 
        // making all diagonal elements 0
        print2DArray(makeDiagZero(numbers));
    }
    
}
