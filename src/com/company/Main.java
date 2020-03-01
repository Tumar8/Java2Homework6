package com.company;

import com.company.Airline;

public class Main {

    public static void main(String[] args) {
        Airline<Integer, Integer, Integer> flyDubai = new Airline<>(16, 5, 1500);
        Airline<Integer, Integer, Integer> flyLondon= new Airline<>(10, 8, 3500);
        flyToDubai(flyDubai);
        System.out.println("______________________");
        flyToDubai(flyLondon);
    }
    public static void flyToDubai(Airline<Integer, Integer, Integer> getInfo) {
        System.out.println(" Information about your flight");
        getInfo.buy();
    }


}

