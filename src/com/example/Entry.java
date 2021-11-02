package com.example;

import java.util.Locale;
import java.util.ResourceBundle;

public class Entry {
    private static final Locale VIETNAM = new Locale("vi", "VN");

    public static void main(String[] args){
        //printEnglishMenu();
        printVietnameseMenu();
    }

    private static void printEnglishMenu(){
        ResourceBundle rb = ResourceBundle.getBundle("Menu", Locale.ENGLISH); //1
        System.out.println("~~~English Menu~~~");
        System.out.println(rb.getString("pumpkinSoup")); //2
        System.out.println(rb.getString("cheeseCake")); //3
    }

    private static void printVietnameseMenu(){
        ResourceBundle rb = ResourceBundle.getBundle("Menu", VIETNAM); //using constant
        System.out.println("~~~Vietnamese Menu~~~");
        System.out.println(rb.getString("pumpkinSoup"));
        System.out.println(rb.getString("cheeseCake"));
    }
}
