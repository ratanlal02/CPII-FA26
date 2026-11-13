/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module05;

/**
 *
 * @author RLAL
 */
public class A implements I1, I2{
    
    @Override
    public int foo(int x){
        return I2.super.foo(x);
    }
    
}
