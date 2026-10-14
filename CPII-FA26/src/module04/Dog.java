/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module04;

/**
 *
 * @author rlal
 */
public class Dog {
    private String name;
    private String breed;
    private int age;
    
    public Dog(){
        this("Unknown", "Unknown", 0);
//     name = "Unknown";
//     breed = "Unknown";
//     age = 0;
    }
    
    public Dog(String name, String breedIn, int ageIn){
        this.name = name;
        breed = breedIn;
        age = ageIn;
    }
    
    // Getter or Accessor Methods
    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }
    
    public int getAge(){
        return age;
    }
    
    // Setter or Mutator Methods
    public void setName(String name){
        this.name = name;
    }
    
    public void setBreed(String breedIn){
        breed = breedIn;
    }
    
    public void setAge(int ageIn){
        age = ageIn;
    }
    
    public String bark(){
        return "bow wow";
    }
    
    @Override
    public String toString(){
        return name+" is a "+breed+", who is "+age+"years old.";
    }
}
