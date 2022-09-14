package com.hw8.models;

public class ArrayValueCalculator {

    //constructor
    public ArrayValueCalculator() {
        super();
    }

    //methods
    public Integer doCalc(String[][] array) throws ArraySizeException, ArrayDataException{
        try {
            this.handleExceptions(array);
            int sum = 0;

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    try {
                        sum += Integer.parseInt(array[i][j]);
                    } catch (NumberFormatException e) {
                        throw new ArrayDataException("Array element is not numeric! " + array[i][j], array[i][j]);
                    }
                }
            }

            return sum;
        }
        catch (NullPointerException e){
            return -666;
        }
    }


    private void handleExceptions(String[][] array) throws ArraySizeException{
        if (array.length != 4 ) {
            throw new ArraySizeException();
        }

        for(int i = 0; i < array.length; i++ ){
            if(array[i].length != 4){
                throw new ArraySizeException();
            }
        }

    }
}
