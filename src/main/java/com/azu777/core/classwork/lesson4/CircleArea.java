package com.azu777.core.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by azu on 2/14/2017.
 */
public class CircleArea {
    public static void calculate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input radius");
        double radius = scanner.nextDouble();
        double area = Math.PI*radius*radius;
        System.out.println("Area is " + area);
    }
}
