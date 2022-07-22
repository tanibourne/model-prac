import java.util.*;

public class Main {
    public static void main(String[] args) {
        Transportation bus1 = new Bus(2233);
        Transportation bus2 = new Bus(2326);

        bus1.ride(2);
        ((Bus) bus1).getInfo();
        bus1.getFuel(-50);
        bus1.getFuelInfo();
        ((Bus) bus1).updateStatus();
        bus1.getFuel(10);
        ((Bus) bus1).getStatus();
        bus1.getFuelInfo();
        ((Bus) bus1).updateStatus();
        bus1.ride(50);

        bus1.ride(5);
        ((Bus) bus1).getInfo();

        bus1.getFuel(-55);


        bus1.getFuelInfo();
        ((Bus) bus1).updateStatus();
        ((Bus) bus1).getStatus();

        Transportation taxi1 = new Taxi(12344);
        Transportation taxi2 = new Taxi(23455);
        ((Taxi) taxi1).getPlateNum();
        ((Taxi) taxi2).getPlateNum();
        taxi1.getFuelInfo();
        ((Taxi) taxi1).getStatustaxi();

        taxi1.ride(2);
        ((Taxi) taxi1).speakToTaxi("서울역",2);
        ((Taxi) taxi1).getInfoTaxi();
        ((Taxi) taxi1).getStatustaxi();
        taxi1.getFuel(-80);
        ((Taxi) taxi1).pay();
        taxi1.getFuelInfo();
        ((Taxi) taxi1).getEarned();
        taxi1.ride(5);
        taxi1.ride(3);
        ((Taxi) taxi1).speakToTaxi("구디단",12);
        ((Taxi) taxi1).getInfoTaxi();

        taxi1.getFuel(-20);
        ((Taxi) taxi1).pay();
        taxi1.getFuelInfo();
        ((Taxi) taxi1).getStatustaxi();
        ((Taxi) taxi1).getEarned();








    }
}
