package com.company;

import java.util.ArrayList;
import java.util.Collections;

import static com.company.Theatre.seats;

public class Theatre {
    private String name;
    public static ArrayList<Seat> seats = new ArrayList<Seat>();
    private int rows;
    private int seatsPerRow;
    private Seat seatNumber;

    public Theatre(String name, int rows, int seatsPerRow) {
        this.name = name;
        this.rows = rows;
        this.seatsPerRow = seatsPerRow;

        int lastRow = 'A' + (seatsPerRow - 1);
        for (char row = 'A'; row < lastRow; row++) {
            for (int seatNum = 0; seatNum < rows; seatNum++) {
                Seat seat =new Seat(row + String.format("%2d", seatNum));
                seats.add(seat);
            }
            System.out.println();
        }
        }
    public boolean reserveSeat(Seat seatNumber){
        Seat searchSeat = seatNumber;
        int foundSeat = Collections.binarySearch(seats, searchSeat, null);
        if(foundSeat==0){
            reserve(searchSeat);
        }
        return true;
    }
    public boolean getReservedSeats(){
        return reserveSeat(seatNumber);
    }
    public void reserve(Seat seatNumber){
        System.out.println(seatNumber+" has been reserved");
    }
    public void displaySeats(ArrayList<Seat> list){
//        if(reserveSeat(seatNumber)){
//            seats.remove(seatNumber);
//        }

      //  System.out.println(seats);
        for(int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }
    }
//    public void minAndMaxSeat(){
//        System.out.println("The maximum seat is "+Collections.max(seats));
//        System.out.println("The minimum seat is "+Collections.min(seats));
//    }
    public void displayReservedSeats(){
        System.out.println(getReservedSeats());
    }

    class Seat{
        private String seatNumber;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }
        public boolean reserveSeat(Seat seatNumber){
            Seat searchSeat=seatNumber;
            int foundSeat= Collections.binarySearch(seats,searchSeat,null);
            System.out.println(foundSeat);
            return true;
        }
    }
}



