/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module05;

/**
 *
 * @author rlal
 * @param <T1>
 * @param <T2>
 */
public class Calculator<T1 extends Number, T2 extends Number> {
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
    
    public double add() {
        return dataOne.doubleValue() + dataTwo.doubleValue();
    }

    public double subtract() {
        return dataOne.doubleValue() - dataTwo.doubleValue();
    }

    public double multiply() {
        return dataOne.doubleValue() * dataTwo.doubleValue();
    }

    public double divide(T1 a, T2 b) {
        if (dataTwo.doubleValue() == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        return dataOne.doubleValue() / dataTwo.doubleValue();
    }
    
}
