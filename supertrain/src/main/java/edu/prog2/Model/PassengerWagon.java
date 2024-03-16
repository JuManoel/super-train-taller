package edu.prog2.Model;

public class PassengerWagon extends RailRoadCar{
    private int rows;
    private int sits;

    public PassengerWagon() {
        super();
    }

    public PassengerWagon(String identification, String manufacturerName, int wheels, CoupleType coupleType, TypeSpeedCurve typeSpeedCurve, int rows, int sits) {
        super(identification,manufacturerName,wheels,coupleType,typeSpeedCurve);
        this.setRows(rows);
        this.setSits(sits);
    }

    public int getRows() {
        return rows;
    }
    public void setRows(int rows) {
        this.rows = rows;
    }
    public int getSits() {
        return sits;
    }public void setSits(int sits) {
        this.sits = sits;
    }

    @Override
    public String toString() {
        String mensage=super.toString();
        mensage+=String.format(
            "Rows: %d\n"+
            "Sits: %d\n"
        ,this.getRows(),this.getSits());
        return mensage;
    }
}
