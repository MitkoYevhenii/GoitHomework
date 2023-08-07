package ua.goit.Module5.Spaceport;

class JupiterStar extends Spaceport{
    @Override
    public int calculateTotalPrice(int passengerCount) {
        return 500 + 2 * passengerCount;
    }
}
