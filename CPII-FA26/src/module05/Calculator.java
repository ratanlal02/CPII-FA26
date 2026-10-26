/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module05;

/**
 *
 * @author rlal
 */
public class Calculator<T1, T2> {
    T1 dataOne;
    T2 dataTwo;
    
    public Calculator(T1 dataOne, T2 dataTwo){
        this.dataOne = dataOne;
        this.dataTwo = dataTwo;
    }
    
    public T1 getDataOne(){
        return dataOne;
    }
    
    public T2 getDataTwo(){
        return dataTwo;
    }
    
    public void setDataOne(T1 x){
        dataOne = x;
    }
    
    public void setDataTwo(T2 y){
        dataTwo = y;
    }
    
    
}
