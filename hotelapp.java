package facadepattern;

public class hotelapp {
    public static void main(String[] args) {
        frontServ frontDesk = new frontServ();

        ValetServ valet = new ValetServ("AFA312");
        housekeep  houseKeeping = new housekeep(213);
        cart cart = new cart(1);

        frontDesk.serviceReq(valet);
        frontDesk.serviceReq(houseKeeping);
        frontDesk.serviceReq(cart);
    }
}