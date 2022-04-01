package com.zbackendu.main;

///
///  Karol Bestry 47801
/// 

import java.util.Scanner;
import java.util.ArrayList;


public class FizzBuzz {
    public static void main(String args[]) {

Scanner pisz = new Scanner(System.in);
ArrayList<Integer> liczby = new ArrayList<Integer>();


    System.out.println("Podaj 10 liczb: ");
    
    
    for (int i=0; i<10; i++){
        int licznik = i+1;
        System.out.print("Liczba "+licznik+"/10: ");
        int x1 = pisz.nextInt();
        liczby.add(x1);
    }
    
    
    System.out.println("\n\nLiczby w zbiorze: "+ liczby + "\n\nOutput:");


    for (int i = 0; i<10; i++){
    
        if (liczby.get(i) % 3 == 0 && liczby.get(i) % 5 == 0){
            System.out.print("Fizz Buzz");
        }
        else if (liczby.get(i) % 3 == 0){
           System.out.print("Fizz");
        }
        else if (liczby.get(i) % 5 == 0){
           System.out.print("Buzz");
        }
        else{
            System.out.print(liczby.get(i));
        }
        System.out.print(", ");
    }
    System.out.print("KONIEC");
    
    }
}
