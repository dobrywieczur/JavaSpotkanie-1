package com.zbackendu.main;


import java.util.Scanner;


public class main {
    public static void main(String[] args) throws IOException {

int a = 1;
int arrayz[] = new int[a];
int max = 1;

System.out.println("Podaj " + a + " cyfry:");
Scanner scanner = new Scanner(System.in);

for (int i = 0; i < a; i++){
    arrayz[1] = scanner.nextInt();
    if (i == 0){
        max = arrayz[0];  }
    if (arrayz [i] > max ) { max = arrayz [i];}
    System.out.println("Największa liczba to" + max);




    }
}

