package com.azu777.core.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by azu on 2/16/2017.
 */
public class Triangle {
    public static Boolean isTriangle(int a, int b, int c) {
        if (a > 0 && b > 0 && c > 0) {
            if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}