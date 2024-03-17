package edu.prog2.Model;

public class TowedVehicle extends RailVehicle{
    public TowedVehicle() {
        super();
    }
    public TowedVehicle(String identification, String manufacturerName, int wheels, CoupleType coupleType) {
        super(identification, manufacturerName, wheels, coupleType);
    }
}
