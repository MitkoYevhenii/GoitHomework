package ua.goit.Module5;

public class SpaceShip {
    private String name;
    private String serialNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty() && name.length() <= 100) {
            this.name = name;
        }
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        if (checkSerialNumber(serialNumber)) {
            this.serialNumber = serialNumber;
        }
    }

    private boolean checkSerialNumber(String serialNumber) {
        return serialNumber.startsWith("SN") && serialNumber.length() == 8;
    }

    public void printInfo() {
        System.out.println("Name is " + name + ", serial number is " + serialNumber);
    }

    public static void main(String[] args) {
        SpaceShip ship = new SpaceShip();

        ship.setName("Voyager");
        ship.setSerialNumber("SN506788");

        ship.printInfo();
    }
}