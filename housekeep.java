package facadepattern;

public class housekeep implements HotelService {
    private int roomNumber;

    public housekeep (int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public void serviceExecute() {
        cleanRoom(roomNumber);
    }

    public void cleanRoom(int roomNumber) {
        System.out.println("Housekeeping is cleaning the room, the room number is: " + roomNumber + "\n");
    }
}