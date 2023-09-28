package TaskOop4;

public class HotelBookingSystem {
    public static void main(String[] args) {
        Room standardRoom = new StandardRoomm(101, 100.0);
        Room deluxeRoom = new DeluxeRoom(201, 150.0, 2);
        Room suite = new Suite(301, 200.0, 2, true);

        standardRoom.book();
        deluxeRoom.book();
        suite.book();

        standardRoom.checkAvailability();
        deluxeRoom.checkAvailability();
        suite.checkAvailability();

        double standardRoomCharges = standardRoom.calculateCharges(3);
        double deluxeRoomCharges = deluxeRoom.calculateCharges(5);
        double suiteCharges = suite.calculateCharges(7);

        System.out.println("Standard Room Charges: $" + standardRoomCharges);
        System.out.println("Deluxe Room Charges: $" + deluxeRoomCharges);
        System.out.println("Suite Charges: $" + suiteCharges);
    }
}



