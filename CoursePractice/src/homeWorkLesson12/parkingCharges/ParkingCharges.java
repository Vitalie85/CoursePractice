package homeWorkLesson12.parkingCharges;

import java.util.Scanner;

public class ParkingCharges {
    double fee = 2;
    double addFee = 0.50;
    double maxFee = 10;
    int defaultParkingPeriod = 3;

    private  double calculateCharges(double parkingPeriod){
        if(parkingPeriod <= 3) {
            return fee;
        }else if (parkingPeriod > 3 && parkingPeriod < 24) {
            return ((parkingPeriod - defaultParkingPeriod) * addFee)+fee;
        }else if (parkingPeriod > 24){
            return maxFee;
        }
        return 0;
    }
    public static void main(String[] args) {
      double totalToPay;
      double totalCollected = 0;

     ParkingCharges customer1 = new ParkingCharges();
     ParkingCharges customer2 = new ParkingCharges();

     totalToPay = customer1.calculateCharges(5);
        totalCollected += totalToPay;
        System.out.println("Customer1: " + totalToPay);

     totalToPay = customer2.calculateCharges(26);
        totalCollected += totalToPay;
        System.out.println("Customer2: " + totalToPay);

        System.out.println("Total collected: " + totalCollected);
    }
}




    /*A parking garage charges a $2.00 minimum fee to park for up to three
        hours. The garage charges an additional $0.50 per hour for each hour  in
        excess of three hours. The maximum charge for any given 24-hour period is
        $10.00. Assume that no car parks for longer than 24 hours at a time.
        Write an application that calculates and displays the parking charges for
        each customer who parked in the garage yesterday. You should enter the
        hours parked for each customer. The program should display the charge for
        the current customer and should calculate and display the running total of
        yesterday’s receipts. It should use the method calculateCharges to
        determine the charge for each customer*/