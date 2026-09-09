/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module01;

/**
 *
 * @author RLAL
 */
public class TestCondition {
    public static void main(String[] args){
        // check equality for primitive data types
        int x = 5;
        int y = 7;
        System.out.println(x==y);
        // check equality for reference types of variables
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        Student s3 = new Student();
        s3.name = "John";
        Student s4 = new Student();
        s4.name = "John";System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
                
    }
}
