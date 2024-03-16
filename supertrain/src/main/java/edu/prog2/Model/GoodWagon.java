package edu.prog2.Model;

public class GoodWagon extends RailRoadCar{
    private TypeCargo typeCargo;

    public GoodWagon() {
        super();
    }

    public GoodWagon(String identification, String manufacturerName, int wheels, CoupleType coupleType, TypeSpeedCurve typeSpeedCurve, TypeCargo typeCargo) {
        super(identification,manufacturerName,wheels,coupleType,typeSpeedCurve);
        this.setTypeCargo(typeCargo);
    }

    public TypeCargo getTypeCargo() {
        return typeCargo;
    }
    public void setTypeCargo(TypeCargo typeCargo) {
        this.typeCargo = typeCargo;
    }

    @Override
    public String toString() {
        String mensage=super.toString();
        mensage+=String.format(
            "Type Cargo: %s\n"
        , this.getTypeCargo());
        return mensage;
    }
}
