package com.company;

import com.company.example.calculator.Calculator;
import com.company.example.calculator.exceptions.FunctionException;

public class CulcMain {
    /**
     * Calculator used Bin-tree
     */
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        try {
            System.out.println(calculator.calc("sin(0) + max(2,max(4,8))+10.67 + pow(2,10)"));
        } catch (FunctionException e) {
            e.printStackTrace();
        }

    }
}
