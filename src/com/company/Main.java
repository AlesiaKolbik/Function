package com.company;

public class Main {

    public static void main(String[] args) {
        double x;
        double y;

        for (x = -2; x <= 2; x += 0.25) {
            if (x == 0)
                break;

            y = 1 / x;

            System.out.println("x= " + x +  " y= " + y);
        }
    }
}