package facadepattern;

public class ValetServ implements HotelService {
    private String plateNumber;

    public ValetServ(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Override
    public void serviceExecute() {
        pickUpVehicle(plateNumber);
    }

    public void pickUpVehicle(String plateNumber) {
        System.out.println("Valet is picking up the vehicle, vehicle's plate number is: " + plateNumber + "\n");
    }
}