package ua.goit.Module5.Passenger;

abstract class Passenger {
    public abstract String getType();
    public abstract int getTicketPrice();

    public static void main(String[] args) {
        Passenger regular = new RegularPassenger();
        System.out.println(regular.getType()); //Regular
        System.out.println(regular.getTicketPrice()); //199

        Passenger vip = new VIPPassenger();
        System.out.println(vip.getType());  //VIP
        System.out.println(vip.getTicketPrice()); //399
    }
}