package TaskOop4;


class StandardRoomm extends Room {
    public StandardRoomm(int roomNumber, double nightlyRate) {
        super(roomNumber, nightlyRate);
    }

    @Override
    public double calculateCharges(int numOfNights) {
        return getNightlyRate() * numOfNights;
    }
}
