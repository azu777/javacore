package com.azu777.core.homework.utils.runners;

import com.azu777.core.homework.utils.convertors.PrimitiveConvertor;

/**
 * Created by azu on 2/13/2017.
 */
public class Lesson3Runner {
    public static void main (String args[]){

        PrimitiveConvertor convertor = new PrimitiveConvertor();
        convertor.floatToChar(90.0f);
        convertor.intToChar(55);
        convertor.charToInt('s');
    }
}
