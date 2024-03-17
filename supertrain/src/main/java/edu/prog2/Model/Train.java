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
        int locomotives=0;
        int towedVehicles=0;
        for (RailVehicle railVehicle : railsVehicles) {
            if(railVehicle instanceof Locomotive){
                locomotives++;
            }else if(railVehicle instanceof TowedVehicle){
                towedVehicles++;
            }
        }
        if((locomotives>0 && locomotives<=2)&&(towedVehicles>1)){
            for (RailVehicle railVehicle : railsVehicles) {
                this.railsVehicles.add(railVehicle);
            }
        }
        
    }

    public void addRailVehicle(RailVehicle railVehicle){
        this.railsVehicles.add(railVehicle);
    }

    public void setRailVehicle(RailVehicle railVehicle,int index){
        this.railsVehicles.set(index, railVehicle);
    }

    public void showRailsVehicles(){
        int i=0;
        for (RailVehicle railVehicle : railsVehicles) {
            System.out.println("index: "+i);
            System.out.println("Rail Vehicle: "+railVehicle);
        }
    }


    public int totSits(){
        int sits=0;
        for (RailVehicle railVehicle : this.getRailsVehicles()) {
            if(railVehicle instanceof PassengerWagon){
                sits+=((PassengerWagon)railVehicle).getRows()*((PassengerWagon)railVehicle).getSits();
            }
        }
        return sits;
    }

    public boolean isEletric(){
        for (RailVehicle railVehicle : this.getRailsVehicles()) {
            if(railVehicle instanceof Locomotive){
                if(!(((Locomotive)railVehicle).getMotorType().equals(MotorType.ELETRIC))){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean hasPassenger(){
        for (RailVehicle railVehicle : this.getRailsVehicles()) {
            if(railVehicle instanceof PassengerWagon){
                return true;
            }
        }
        return false;
    }

    public int[] contGoodsWagons(){
        int[] cont=new int[7];
        for (int i = 0; i < cont.length; i++) {
            cont[i]=0;
        }
        for (RailVehicle railVehicle : this.getRailsVehicles()) {
            if(railVehicle instanceof GoodWagon){
                if(((GoodWagon)railVehicle).getTypeCargo().equals(TypeCargo.CAGE)){
                    cont[0]++;
                }else if(((GoodWagon)railVehicle).getTypeCargo().equals(TypeCargo.CLOSE)){
                    cont[1]++;
                }else if(((GoodWagon)railVehicle).getTypeCargo().equals(TypeCargo.COOLED)){
                    cont[2]++;
                }else if(((GoodWagon)railVehicle).getTypeCargo().equals(TypeCargo.HOPPER)){
                    cont[3]++;
                }else if(((GoodWagon)railVehicle).getTypeCargo().equals(TypeCargo.OPEN)){
                    cont[4]++;
                }else if(((GoodWagon)railVehicle).getTypeCargo().equals(TypeCargo.PLATAFORM)){
                    cont[5]++;
                }else if(((GoodWagon)railVehicle).getTypeCargo().equals(TypeCargo.TANK)){
                    cont[6]++;
                }
            }
        }

        return cont;
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
