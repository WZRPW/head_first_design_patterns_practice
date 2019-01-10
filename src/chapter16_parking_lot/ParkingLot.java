package chapter16_parking_lot;

public class ParkingLot {

    private final Floor[] floors;

    public ParkingLot(int numFloors, int numSpotsPerFloor) {
        floors = new Floor[numFloors];
        for (int i = 0; i < numFloors; i++) {
            floors[i] = new Floor(numSpotsPerFloor);
        }
    }

    public boolean hasSpot(Vehicle v) {
        for (Floor Flr : floors) {
            if (Flr.hasSpot(v)) {
                return true;
            }
        }
        return false;
    }

    public boolean park(Vehicle v) {
        for(Floor flr : floors) {
            if (flr.park(v)) {
                return true;
            }
        }
        return false;
    }

    public boolean leave(Vehicle v) {
        for (Floor flr : floors) {
            if (flr.leave(v)) {
                return true;
            }
        }
        return false;
    }
}
