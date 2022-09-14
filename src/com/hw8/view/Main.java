package com.hw8.view;

import com.hw8.models.ArrayDataException;
import com.hw8.models.ArraySizeException;
import com.hw8.models.ArrayValueCalculator;

public class Main {
    public static void main(String[] args) throws ArraySizeException, ArrayDataException {

        String[][] array = {{"1234", "1234", "1234", "1234"}, {"5678", "1234", "1234", "1234"},
                {"9101", "1234", "1234", "1234"}, {"1214", "1234", "1234", "1234"}};

        ArrayValueCalculator avc = new ArrayValueCalculator();


        System.out.println(avc.doCalc(array));
    }
}