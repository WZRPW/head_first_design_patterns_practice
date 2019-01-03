package chapter16_parking_lot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot_Simulator {

    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot(11, 25);
        List<Vehicle> list = new ArrayList<>();
        for (int i = 0; i < 52; i++) {
            final Vehicle vhc = (i % 2 == 0) ? new Car() : new Truck();
            list.add(vhc);
            boolean hasSpot = lot.hasSpot(vhc);
            if (i < 41) {
                assert hasSpot;
                assert lot.park(vhc);
            } else {
                assert !hasSpot;
                assert !lot.park(vhc);
            }
        }

        assert list.size() == 52;
        int i = 0;
        for (Vehicle v : list) {
            assert i >= 40 || lot.leave(v);
            i++;
        }
    }
}
