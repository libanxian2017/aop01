package com.centit.aop;

public class Main {
    public static void main(String[] args) {
        MyCalculatorImpl myCalculator = new MyCalculatorImpl();
        MyCalculator instance = (MyCalculator)CalculatorProxy.getInstance(myCalculator);
        int add = instance.add(3, 4);
        System.out.println(add);
    }
}
