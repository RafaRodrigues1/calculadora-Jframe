package com.calculadora;

import javax.swing.JOptionPane;

/* 
 * @author RafaelRodrigues1
 */
public class Calculadora {
    
    private Double num1;
    private Double num2;

    public Calculadora(Double num1, Double num2) {
        this.num1 = num1;
        this.num2 = num2;       
    }
    
    public Double calcular(String sim){

        switch (sim){
            case"+" ->{
                return num1+num2;
            }
            case"-" ->{
                return num1-num2;
            }
            case"*" ->{
                return num1*num2;
            }
            case"/" ->{
                return num1/num2;
            } 
            default -> {
                throw new ArithmeticException();
            }
        }
    }
}
