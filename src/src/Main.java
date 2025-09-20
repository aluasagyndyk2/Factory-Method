public class Main {
    public static void main(String[] args) {
        Logistics road = new RoadLogistics();
        road.planDelivery(); // Delivering by land in a truck.

        Logistics sea = new SeaLogistics();
        sea.planDelivery(); // Delivering by sea in a ship.
    }
}
