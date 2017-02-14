package com.azu777.core.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by azu on 2/14/2017.
 */
public class CircleArea {
    public static double calculate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input radius");
        double radius = scanner.nextDouble();
        double area = Math.PI*radius*radius;
        System.out.println("Area is " + area);
        return radius;
    }


        public static void calculateBigger(){
            double CircleArea1 = CircleArea.calculate();
            double CircleArea2 = CircleArea.calculate();
            if (CircleArea1 > CircleArea2)
                System.out.print("CircleArea1 is bigger");
                else
                System.out.print("CircleArea2 is bigger");
                    }
}
