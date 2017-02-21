package com.azu777.core.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by azu on 2/20/2017.
 */
public class BigSmallRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a ");
        int a = sc.nextInt();
        System.out.println("Input b ");
        int b = sc.nextInt();

        if (BigSmall.compareNum(a, b)) {
            System.out.println("a is bigger");
        } else
            System.out.println("b is bigger");
    }
}
