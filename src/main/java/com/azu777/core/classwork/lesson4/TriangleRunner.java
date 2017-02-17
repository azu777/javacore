package com.azu777.core.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by azu on 2/16/2017.
 */
public class TriangleRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a");
        int a = scanner.nextInt();
        System.out.println("Input b");
        int b = scanner.nextInt();
        System.out.println("Input c");
        int c = scanner.nextInt();

        if (Triangle.isTriangle(a, b, c)) {
            System.out.println("Triangle is correct");
        } else
            System.out.println("Triangle is not correct");
    }
}