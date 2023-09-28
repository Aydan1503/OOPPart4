package TaskOop4;

class Suite extends Room {
    private int numOfBeds;
    private boolean hasLivingRoom;

    public Suite(int roomNumber, double nightlyRate, int numOfBeds, boolean hasLivingRoom) {
        super(roomNumber, nightlyRate);
        this.numOfBeds = numOfBeds;
        this.hasLivingRoom = hasLivingRoom;
    }

    public int getNumOfBeds() {
        return numOfBeds;
    }

    public boolean hasLivingRoom() {
        return hasLivingRoom;
    }

    @Override
    public double calculateCharges(int numOfNights) {
        return getNightlyRate() * numOfNights;
    }
}

