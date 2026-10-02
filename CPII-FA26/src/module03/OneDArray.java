/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module03;

import java.util.Arrays;

/**
 *
 * @author RLAL
 */
public class OneDArray {
    public static void main(String[] args){
        int[] numbersOne = new int[5];
        // another method
        int[] numbersTwo = {3,4,6,5,7};
        // One way to copy
        for(int i=0; i < numbersOne.length; i++){
            numbersOne[i] = numbersTwo[i];
        }
        for(int i=0; i < numbersOne.length; i++){
            System.out.print(numbersOne[i]+" ");
        }
        // Clone
        numbersOne = numbersTwo.clone();
        for(int x:numbersOne){
            System.out.print(x+" ");
        }
        System.out.println("");
        // ArrayCopy
        System.arraycopy(numbersTwo, 0, numbersOne, 0, 5);
        for(int x:numbersOne){
            System.out.print(x+" ");
        }
        System.out.println("");
        //Arrays.fill(numbersOne, 5);
        
        Arrays.sort(numbersOne);
        for(int x:numbersOne){
            System.out.print(x+" ");
        }

    }
}
