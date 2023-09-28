package TaskOop4;

class DeluxeRoom extends Room {
    private int numOfBeds;

    public DeluxeRoom(int roomNumber, double nightlyRate, int numOfBeds) {
        super(roomNumber, nightlyRate);
        this.numOfBeds = numOfBeds;
    }

    public int getNumOfBeds() {
        return numOfBeds;
    }

    @Override
    public double calculateCharges(int numOfNights) {
        return getNightlyRate() * numOfNights;
    }
}

