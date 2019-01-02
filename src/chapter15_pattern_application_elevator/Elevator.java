package chapter15_pattern_application_elevator;

import java.util.Queue;

public class Elevator {
    //default parameters
    public static final int DEFAULT_ELEVATOR_MAX_CAPACITY = 10;
    public static final int DEFAULT_ELEVATOR_MAX_FLOOR = 50;
    public static final int DEFAULT_INITIAL_LOCATION = 3;

    private final int maxCapacity;
    private final int maxFloor;
    private int load;
    private int location;
    private boolean isGoingUp;

    //All requests loaded onto this elevator
    private int[] requests;

    public Elevator(int maxCapacity, int maxFloor) {
        this.maxCapacity = maxCapacity;
        this.maxFloor = maxFloor;
        load = 0;
        location = DEFAULT_INITIAL_LOCATION;
        isGoingUp = true;
        requests = new int[maxFloor];
    }

    public Elevator() {
        this(DEFAULT_ELEVATOR_MAX_CAPACITY, DEFAULT_ELEVATOR_MAX_FLOOR);
    }

    public boolean isEmpty() {
        return load == 0;
    }

    public boolean isFull() {
        return load >= maxCapacity;
    }

    public int getLocation() {
        return location;
    }

    public int move() {
        if (isGoingUp) {
            return (location + 1 <= maxFloor) ? ++location : location;
        } else {
            return (location - 1 > 0) ? --location : location;
        }
    }

    public boolean changeMovingDirection() {
        isGoingUp = !isGoingUp;
        return isGoingUp;
    }

    public int load(Queue<Integer> curQueue) {
        int numNewLoad = curQueue.size();
        if (load + numNewLoad > maxCapacity) {
            return 0;
        }
        for (int requestFloor : curQueue) {
            requests[requestFloor - 1] += 1;
        }
        load += numNewLoad;
        curQueue.clear(); // is this Queue going to be reused later?
        return numNewLoad;
    }

    public int unload() {
        //unload the requestion for location (current location)
        int numRequests = requests[location - 1];
        if (numRequests > 0) {
            load -= numRequests;
            requests[location - 1] = 0;
            return numRequests;
        }
        return 0;
    }
}

