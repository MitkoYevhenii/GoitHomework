package ua.goit.Module5.Engine;

class Engine {
    private int power;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    // return standard fuel type
    public String getFuelType() {
        return "A500";
    }

    public static void main(String[] args) {
        AdvancedXFuelEngine engine = new AdvancedXFuelEngine();
        engine.setPower(1000);
        engine.setSerialNumber("SN504030");
        engine.printInfo();
    }
}



