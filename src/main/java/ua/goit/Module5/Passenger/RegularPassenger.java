package ua.goit.Module5.Passenger;

public class RegularPassenger extends Passenger {

    @Override
    public String getType() {
        return "Regular";
    }

    @Override
    public int getTicketPrice() {
        return 199;
    }
}
