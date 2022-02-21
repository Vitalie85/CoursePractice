package homeWorkLesson12.parkingChargesTwo;


public class ParkingChargesTwo {
    public static void main(String[] args) {
        double total = 0;
        Customer [] customers = new Customer[2];

        customers[0] = new Customer("Customer1", 5);
        customers[1] =new Customer("Customer2", 25);

        ParkingCharges charges = new ParkingCharges();

        for (Customer customer:customers){

            System.out.println(customer.name + " " + charges.calculateCharges(customer.hoursParked));

            total = charges.totalCollected(charges.calculateCharges(customer.hoursParked));
       }
        System.out.println("Total collected: " + total);
    }
}
