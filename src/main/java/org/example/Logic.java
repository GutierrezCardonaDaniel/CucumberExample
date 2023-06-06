package org.example;

public class Logic {

    public static int multiplyWithFor(int x, int y){
        int result = 0;
        for (int i = 0; i<y; i++){
            result += x;
        }
        return result;
    }

    public static int multiplyLogic(int x, int y){
        return x*y;
    }
}
