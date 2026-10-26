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
    
    }
}
