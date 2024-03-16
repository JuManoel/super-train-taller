package edu.prog2.Model;

public abstract class RailRoadCar extends RailVehicle{
    protected TypeSpeedCurve typeSpeedCurve;

    public RailRoadCar() {
        super();
    }

    public RailRoadCar(String identification, String manufacturerName, int wheels, CoupleType coupleType, TypeSpeedCurve typeSpeedCurve) {
        super(identification,manufacturerName,wheels,coupleType);
        this.setTypeSpeedCurve(typeSpeedCurve);
    }

    public TypeSpeedCurve getTypeSpeedCurve() {
        return typeSpeedCurve;
    }
    public void setTypeSpeedCurve(TypeSpeedCurve typeSpeedCurve) {
        this.typeSpeedCurve = typeSpeedCurve;
    }

    @Override
    public String toString() {
       String mensage=super.toString();
       mensage+=String.format(
        "Type Curve Speed: %s\n"
       ,this.getTypeSpeedCurve());

       return mensage;
    }

}
