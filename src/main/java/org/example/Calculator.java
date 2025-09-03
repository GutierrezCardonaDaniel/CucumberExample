package org.example;

public class Calculator {

    public static int sum(int x, int y){
        return x + y;
    }

    public static int subtract(int x, int y){
        return x - y;
    }

    public static int multiply(int x, int y){
       return Logic.multiplyLogic(x,y);
    }

    public static float divide(float x, float y){
        return x/y;
    }
}
