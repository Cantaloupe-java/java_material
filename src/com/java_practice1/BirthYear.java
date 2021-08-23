package com.java_practice1;
import java.util.Scanner;

public class BirthYear {
    int y;
    String lastname = "Karumanchi";
    public void BirthMethod(){
        if ( y>=1996){
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter year");
            String userName = myObj.nextLine();
            System.out.println(lastname + y);


        }
        else {
            Scanner myObj = new Scanner(System.in);
            String userName = myObj.nextLine();
            System.out.println("Wrong Year");
        }
    }
}
