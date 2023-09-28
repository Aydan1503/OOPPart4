package TaskOop4;

abstract class Room {
    private int roomNumber;
    private double nightlyRate;
    private boolean booked;

    public Room(int roomNumber, double nightlyRate) {
        this.roomNumber = roomNumber;
        this.nightlyRate = nightlyRate;
        this.booked = false;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public double getNightlyRate() {
        return nightlyRate;
    }

    public boolean isBooked() {
        return booked;
    }

    public void book() {
        booked = true;
    }

    public void checkAvailability() {
        if (booked) {
            System.out.println("Room " + roomNumber + " is booked.");
        } else {
            System.out.println("Room " + roomNumber + " is available.");
        }
    }

    public abstract double calculateCharges(int numOfNights);
}
