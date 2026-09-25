/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module02;

/**
 *
 * @author rlal
 */
public class FormattingOutput {
    public static void main(String[] args){
        for(int i=1; i<11; i++){
            for(int j=1; j <11; j++){
                System.out.printf("%-4d %5d \n", i, i*j);
            }
        }
    }
}
