/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module04;

/**
 *
 * @author RLAL
 */
public class Driver {
    
    public static void main(String[] args){
        //Student s = new Student("Jackson");
        //System.out.println(s);
        Dog zelda = new Dog("Zelda", "Standard Poodle", 7);
        System.out.println(zelda.getName());
        zelda.setName("Adi");
        System.out.println(zelda.getName());
        System.out.println(zelda.bark());
        Dog d = new Dog();
        System.out.println(d.getName());
        
    }
    
}
