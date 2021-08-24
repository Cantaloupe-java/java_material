package com.java_practice1;

public class ArrayNumbers {
    //    int i;
    int[] num = new int[100];

    /*public void NumArray() {
        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1;
            System.out.println("num[" + i + "] = " + num[i]);
        }

    }*/

    public void Reverse() {
        int j = num.length;
        for (int i = 0; i< num.length; i++) {

            num[i] = j;
            System.out.println("num[" + i + "] = " + num[i]);
            j--;


        }
    }
}
