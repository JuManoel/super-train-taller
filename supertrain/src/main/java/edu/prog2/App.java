package edu.prog2;

import java.util.ArrayList;

import edu.prog2.Model.CoupleType;
import edu.prog2.Model.GoodWagon;
import edu.prog2.Model.Locomotive;
import edu.prog2.Model.MotorType;
import edu.prog2.Model.PassengerWagon;
import edu.prog2.Model.RailVehicle;
import edu.prog2.Model.TowedVehicle;
import edu.prog2.Model.Train;
import edu.prog2.Model.TypeCargo;
import edu.prog2.Model.TypeSpeedCurve;

public class App {
    public static void main(String[] args) {
        ArrayList<GoodWagon> goodWagons =new ArrayList<>();
        {
            goodWagons.add(new GoodWagon("goodwagon1", "JuansLoksWagon", 8, CoupleType.AUTOMATIC, TypeSpeedCurve.A, TypeCargo.CAGE));
            goodWagons.add(new GoodWagon("goodwagon2", "Marios Bros", 6, CoupleType.MANUAL, TypeSpeedCurve.B, TypeCargo.CLOSE));
            goodWagons.add(new GoodWagon("goodwagon3", "CarlosCuesta INC", 10, CoupleType.SEMIPERMANENT, TypeSpeedCurve.D, TypeCargo.COOLED));
            goodWagons.add(new GoodWagon("goodwagon4", "UCaldas LTDA", 8, CoupleType.AUTOMATIC, TypeSpeedCurve.N, TypeCargo.HOPPER));
            goodWagons.add(new GoodWagon("goodwagon5", "Trem e derivados", 4, CoupleType.MANUAL, TypeSpeedCurve.A, TypeCargo.OPEN));
            goodWagons.add(new GoodWagon("goodwagon6", "JuansLoksWagon", 8, CoupleType.SEMIPERMANENT, TypeSpeedCurve.B, TypeCargo.PLATAFORM));
            goodWagons.add(new GoodWagon("goodwagon7", "JuansLoksWagon", 8, CoupleType.AUTOMATIC, TypeSpeedCurve.N, TypeCargo.TANK));
        }
        ArrayList<Locomotive> locomotives = new ArrayList<>();
        {
            locomotives.add(new Locomotive("Locomotive1", "Lokos y Borachos", 16, CoupleType.AUTOMATIC, MotorType.DIESEL));
            locomotives.add(new Locomotive("Locomotive2", "RELOKO por trenes", 10, CoupleType.MANUAL, MotorType.ELETRIC));
            locomotives.add(new Locomotive("Locomotive3", "Ferroviaria", 20, CoupleType.SEMIPERMANENT, MotorType.STEAM));
        }
        ArrayList<PassengerWagon> passengerWagons = new ArrayList<>();
        {
            passengerWagons.add(new PassengerWagon("Passeger Wagon1", "Garen", 8, CoupleType.AUTOMATIC, TypeSpeedCurve.A, 10, 3));
            passengerWagons.add(new PassengerWagon("Passeger Wagon2", "VI", 16, CoupleType.MANUAL, TypeSpeedCurve.B, 8 , 4));
            passengerWagons.add(new PassengerWagon("Passeger Wagon3", "Confia", 31, CoupleType.SEMIPERMANENT, TypeSpeedCurve.D, 4, 5));
        }

        ArrayList<TowedVehicle> towedVehicles =new ArrayList<>();
        {
            towedVehicles.add(new TowedVehicle("Towed1", "Rei de los TRenes", 16, CoupleType.AUTOMATIC));
            towedVehicles.add(new TowedVehicle("Towed2", "Trenes con colores", 6, CoupleType.MANUAL));
            towedVehicles.add(new TowedVehicle("Towed3", "LOKO", 16, CoupleType.SEMIPERMANENT));
        }

        ArrayList<Train> trains=new ArrayList<>();
        

    }

    public void listEspecificTrains(ArrayList<Train> trains){
        int[] cont;
        for (Train train : trains) {
            if((!train.hasPassenger())){
                cont=train.contGoodsWagons();
                if(cont[6]>=1 && cont[0]==3){
                    System.out.println(train.toString());
                }
            }
        }
    }

    

}