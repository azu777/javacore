package com.azu777.core.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by azu on 2/16/2017.
 */
public class EvenOddRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number ");
        int a = sc.nextInt();

        if (EvenOdd.isOdd(a)) {
            System.out.println("Not All in pairs");
        } else
            System.out.println("All in pairs");
    }
}
