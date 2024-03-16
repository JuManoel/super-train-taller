package edu.prog2.Model;

import java.util.ArrayList;

public class Train {
    private String identification;
    private ArrayList<RailVehicle> railsVehicles;


    public Train() {
        super();
    }

    public Train(String indentication, ArrayList<RailVehicle> railVehicles) {
        this.setIdentification(indentication);
        this.setRailsVehicles(railVehicles);
    }

    public Train(String indentication, RailVehicle railVehicle) {
        this.setIdentification(indentication);
        ArrayList<RailVehicle> railVehicles=new ArrayList<>();
        railVehicles.add(railVehicle);
        this.setRailsVehicles(railVehicles);
    }

    public String getIdentification() {
        return identification;
    }
    public void setIdentification(String identification) {
        this.identification = identification;
    }
    public ArrayList<RailVehicle> getRailsVehicles() {
        return railsVehicles;
    }
    public void setRailsVehicles(ArrayList<RailVehicle> railsVehicles) {
        this.railsVehicles = railsVehicles;
    }

    public void addRailsVehicle(RailVehicle railVehicle){
        this.railsVehicles.add(railVehicle);
    }

    public void setRailsVehicle(RailVehicle railVehicle,int index){
        this.railsVehicles.set(index, railVehicle);
    }

    public void showRailsVehicle(){
        int i=0;
        for (RailVehicle railVehicle : railsVehicles) {
            System.out.println("index: "+i);
            System.out.println("Rail Vehicle: "+railVehicle);
        }
    }




    @Override
    public String toString() {
        String mensaje;
        String vehicles="";
        for (RailVehicle railVehicle : railsVehicles) {
            vehicles+=railVehicle.toString();
        }
        mensaje=String.format(
            "Id: %s\n"+
            "Rails Vehicles: \n%s"
        ,this.getIdentification(),vehicles);
        return mensaje;
    }
}
