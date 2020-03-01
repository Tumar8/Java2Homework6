package com.company;

import java.awt.desktop.PrintFilesEvent;

public  class Airline  <A extends Number, B extends Number, C extends Number > implements Buyable{
    A ticketNum;
    B seatNum;
    C price;

    public Airline() {
    }

    public Airline(A ticket, B seatNum, C price) {
        this.ticketNum = ticket;
        this.seatNum = seatNum;
        this.price = price;
    }

    public A getTicket() {
        return ticketNum;
    }


    public B getSeatNum() {
        return seatNum;
    }

    public C getPrice() {
        return price;
    }


    @Override
    public void buy() {
        System.out.println( "the number of ticket   " + getTicket() +  " \n " + "The number of Your seat  " +   getSeatNum()+ " \n"  + " Price for your ticket is" +getPrice());


    }
}
