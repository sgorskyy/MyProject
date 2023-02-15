package com.ua.main.homework9;

import java.util.Random;

public class ArrayClassSample {
    private int[] arrayForSort;
    private int arraySize;

    public ArrayClassSample(int arraySize) {
        this.arraySize = arraySize;
        arrayForSort = new int[arraySize];

        Random arrayValue = new Random();

        for (int i = 0; i < arraySize; i++) {
            arrayForSort[i] = arrayValue.nextInt(arraySize*2);
        }

        printArray();
    }


    public void ascendingOrder(){
        for (int i = 0; i < arraySize; i++) {
            for (int j =0; j<i; j++){

                if(arrayForSort[j] > arrayForSort[i]){
                    int storeNum = arrayForSort[i];
                    arrayForSort[i] = arrayForSort[j];
                    arrayForSort[j] = storeNum;
                }
            }
        }
        printArray();
    }

    public void descendingOrder(){
        for (int i = 0; i < arraySize; i++) {
            for (int j =0; j<i; j++){

                if(arrayForSort[j] < arrayForSort[i]){
                    int storeNum = arrayForSort[i];
                    arrayForSort[i] = arrayForSort[j];
                    arrayForSort[j] = storeNum;
                }
            }
        }
        printArray();
    }

    public void printArray(){

        System.out.print("[");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(arrayForSort[i]);
            if (i < arraySize - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]\n");

    }
}

