package com.company;

import java.util.ArrayList;

import static com.company.Theatre.seats;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("San CINEMAS", 5, 5);
        displaySeats(seats);
    }

    private static void displaySeats(ArrayList<Theatre.Seat> showSeat) {
        for(int i=0;i<showSeat.size();i++){
            System.out.println(showSeat.get(i));
        }
    }

}

