package homeWorkLesson12.parkingChargesTwo;

public class ParkingCharges {
    double fee = 2;
    double addFee = 0.50;
    double maxFee = 10;
    int defaultParkingPeriod = 3;
    double totalCollected = 0;

    public double calculateCharges(double hoursParked){
        if(hoursParked <= 3) {
            return fee;
        }else if (hoursParked > 3 && hoursParked <= 24) {
            return ((hoursParked - defaultParkingPeriod) * addFee)+fee;
        }else if (hoursParked > 24){
            return maxFee;
        }
        return 0;
    }
    public double totalCollected(double total){
        totalCollected += total;
        return totalCollected;
    }
}
