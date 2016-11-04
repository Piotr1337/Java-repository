package com.company;

/**
 * Created by Piotrek on 2016-11-04.
 */
public class Holiday {

    String desc;
    String countr;
    String hot;
    String ter;
    String fd;
    int pr;

    public Holiday(String description, String Country, String Hotel, String term, String food, int price ) {
        desc = description;
        countr = Country;
        hot = Hotel;
        ter = term;
        fd = food;
        pr = price;
    }
    public void getPrice()
    {
        System.out.println("Cena: " + pr);
    }

    public void getAllInformation(){
        System.out.println("Opis: " + desc);
        System.out.println("Kraj: " + countr);
        System.out.println("Hotel: " + hot);
        System.out.println("Termin: " + ter);
        System.out.println("Wyżywienie: " + fd);
        System.out.println("Cena: " + pr);

    }
}
