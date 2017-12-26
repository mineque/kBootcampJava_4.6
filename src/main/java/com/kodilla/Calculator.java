package com.kodilla;

import static java.lang.System.*;

public class Calculator {
    public int addInts(int first, int second) {
        return first + second;
    }

    public int substractInts(int first, int second) {
        return first - second;
    }


    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        out.println(calculator.addInts(30, 40));
        out.println(calculator.substractInts(30, 40));
    }
}