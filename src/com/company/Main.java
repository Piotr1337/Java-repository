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
        Holiday Grece = new Holiday("Wakacje w Grecji", "Grecja", "Hotel 1", "23-03-2016", "Banan", 2000);
        Holiday Spain = new Holiday("Wakacje w Hiszpanii", "Hiszpania", "Hotel 2", "24-03-2016", "Bigos", 3000);
        Holiday Italy = new Holiday("Wakacje we Włoszech", "Włochy", "Hotel 3", "25-03-2016", "Pizza", 4000);
        Grece.getAllInformation();
        Spain.getAllInformation();
        Italy.getAllInformation();
    }

}

