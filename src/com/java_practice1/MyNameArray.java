package com.java_practice1;

public class MyNameArray {
    String FullName = "Ramya Krishna Karumanchi";
    String[] namearray = new String[3];
    public void PrintName(){
        System.out.println("before----- " + namearray[0]);
        namearray[0] = FullName;
        System.out.println("after------ " + namearray[0]);
    }
    public void NewMethod(){
        String[] var1 = FullName.split("R");
        System.out.println("*****" + var1[0].length());
        System.out.println("$$$$$" + var1[1].length());
//        System.out.println(var1[2]);
    }
}
