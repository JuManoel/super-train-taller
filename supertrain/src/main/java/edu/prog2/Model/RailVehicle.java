package edu.prog2.Model;

public abstract class RailVehicle {
    protected String identification;
    protected String manufacturerName;
    protected int wheels;
    protected CoupleType coupleType;
    public RailVehicle() {
        super();
    }

    public RailVehicle(String identification, String manufacturerName, int wheels, CoupleType coupleType) {
        this.setIdentification(identification);
        this.setManufacturerName(manufacturerName);
        this.setWheels(wheels);
        this.setCoupleType(coupleType);

    }

    public String getIdentification() {
        return identification;
    }
    public void setIdentification(String identification) {
        this.identification = identification;
    }
    public String getManufacturerName() {
        return manufacturerName;
    }
    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }
    public int getWheels() {
        return wheels;
    }
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    public CoupleType getCoupleType() {
        return coupleType;
    }
    public void setCoupleType(CoupleType coupleType) {
        this.coupleType = coupleType;
    }
    @Override
    public String toString() {
        String mensage="";
        mensage=String.format(
            "Id: %s\n"+
            "Manufacturer Name: %s\n"+
            "Wheels: %d\n", 
        this.getIdentification(),this.getManufacturerName(),this.getWheels());
        return super.toString();
    }
}
