package com.zbackendu.main;


import java.util.Scanner;
import  java.util.List;
import  java.util.ArrayList;



public class main {
    public static void main(String[] args){

        List<Integer> input = new ArrayList<>(5);
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i<5; i++){

            System.out.print("Podaj liczbę: ");
            int i1 = scanner.nextInt();
            input.add(i1);
        }

        int najwieksza = 0;
        for (Integer element : input) {
            if (element > najwieksza) najwieksza = element;
        }
        System.out.print(najwieksza);
    }
}

