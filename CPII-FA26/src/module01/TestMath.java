/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module01;

/**
 *
 * @author RLAL
 */
public class TestMath {
    public static void main(String[] args){
        int x = 4;
//        int y = 10;
//        int z = 15;
//        int total = x + y + z;
//        double expr = x/y+z*x+2*y;
//        System.out.println(x+y);
//        System.out.println(x-y);
//        System.out.println(x/y);
//        System.out.println(x%y);
//        System.out.println(total);
//        System.out.println(expr);
//        System.out.println(((double)total)/3);
//        System.out.println(total*1.0/3);
        
        // Post Increment
        //System.out.println(x++*x++);
        //System.out.println(x);
        
        // Post Decrement
        //System.out.println(x--*x--);
        //System.out.println(x);
        
        // Pre increment
        //System.out.println(++x*++x);
        //System.out.println(x);
        
        // Pre decrement
        //System.out.println(--x*--x);
        //System.out.println(x);  
        
        // Practice round method
        System.out.println(Math.round(3.49));
        System.out.println(Math.round(5.5));
        System.out.println(Math.sqrt(25));
        System.out.println(Math.pow(2, 3));
        // The largest integer less than or equal to the number
        System.out.println(Math.floor(3.9));
        // The smallest integer greater than or equal to the number
        System.out.println(Math.ceil(3.5));
        
        // random method
        System.out.println(Math.random());
        System.out.println(Math.floor(Math.random()*6)+1);
        

    }
}
