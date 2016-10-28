package com.company;
import java.util.Random;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        int A1 = 0;
        Boolean parseResult = false;
        System.out.print("Podaj N:");
        try{
            n = Integer.parseInt(br.readLine());
        }catch(NumberFormatException nfe){
            System.err.println("Zły format!");

        }
        System.out.print("Podaj A1:");
        try{
            A1 = Integer.parseInt(br.readLine());
        }catch(NumberFormatException nfe){
            System.err.println("Zły format!");
        }
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            A1 += rand.nextInt(1000);
            System.out.println(A1);
        }
    }
}

