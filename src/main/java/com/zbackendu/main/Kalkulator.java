package com.zbackendu.main;

///
///  Karol Bestry 47801
/// 

import java.util.Scanner;
import java.lang.Math;


public class Kalkulator {
    public static void main(String args[]) {

    Scanner skan = new Scanner(System.in);
    double x;
    double y;
    String znak; 
        
    System.out.println("||||||||||||||||||||||||||||");    
    System.out.println("|||                      |||");
    System.out.println("|||  Prosty kalkulator   |||");
    System.out.println("|||                      |||");
    System.out.println("|||  essasito edition    |||");
    System.out.println("|||                      |||");
    System.out.println("||||||||||||||||||||||||||||");
        
    System.out.println("\nPodaj dwie liczby oraz wybierz jedną z pięciu możliwych operacji: (+, -, *, /, pow - potęgowanie)");
    System.out.print("Liczba 1: ");
    x = skan.nextInt();
    System.out.print("Liczba 2: ");
    y = skan.nextInt();
    System.out.print("Operacja: ");
    skan.nextLine();
    znak = skan.nextLine();

    
        System.out.println(" ");
    
    switch (znak){
    case "+":
        System.out.print("Wynik: "+ (x + y) );    
        break;
        
    case "-":
        System.out.print("Wynik: "+ (x - y) );    
        break;
        
    case "*":
        System.out.print("Wynik: "+ (x * y) );    
        break;
        
    case "/":
        System.out.print("Wynik: "+ (x / y) );    
        break;
        
    case "pow":
        System.out.print("Wynik: "+ Math.pow(x, y) );    
        break;
        
    default:
        System.out.print("Błędne dane.");
    
    }

    }
}
