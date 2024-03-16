package edu.prog2.Model;

public class Locomotive extends RailVehicle{
    private MotorType motorType;
    
    public Locomotive() {
        super();
    }

    public Locomotive(String identification, String manufacturerName, int wheels, CoupleType coupleType, MotorType motorType) {
        super(identification,manufacturerName,wheels,coupleType);
        this.setMotorType(motorType);
    }

    public MotorType getMotorType() {
        return motorType;
    }
    public void setMotorType(MotorType motorType) {
        this.motorType = motorType;
    }

    @Override
    public String toString() {
        String mensage=super.toString();
        mensage+=String.format(
            "Type Motor: %s\n"
        , this.getMotorType());
        return mensage;
    }
}
