package ua.goit.Module5.Engine;

class XFuelEngine extends Engine {

    protected String serialNumber;

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String getFuelType() {
        return "XFuel";
    }
}
