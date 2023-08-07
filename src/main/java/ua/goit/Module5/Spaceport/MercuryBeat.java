package ua.goit.Module5.Spaceport;

class MercuryBeat extends Spaceport {
    @Override
    public int calculateTotalPrice(int passengerCount) {
        return 15 * passengerCount;
    }
}
