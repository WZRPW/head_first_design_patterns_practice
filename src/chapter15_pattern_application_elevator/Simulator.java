package chapter15_pattern_application_elevator;

import java.util.*;

public class Simulator {
    private final int floors;
    private List<Queue<Integer>> requests;
    private List<Elevator> elevators;
    private Scheduler scheduler;

    //floors: max floors of the building
    //numElevators:
    //scheduler:
    //initialRequest:
    //elevatorCapacity:
    public Simulator(int floors, int numElevators, Scheduler scheduler, List<Queue<Integer>> initialRequests, int elevatorCapacity) {
        this.floors = floors;
        this.scheduler = scheduler;
        requests = initialRequests;
        elevators = new ArrayList<Elevator>();
        for (int i = 0; i < numElevators; i++) {
            Elevator ele = new Elevator(elevatorCapacity, floors);
            elevators.add(ele);
        }
    }

    private void generateRequest() {

    }

    private void schedule() {
        scheduler.schedule(requests, elevators, floors);
    }

    private void elevatorOp() {
        for (Elevator e : elevators) {
            if (!e.isEmpty()) {
                e.unload();
            }
            if (!e.isFull()) {
                int location = e.getLocation();
                e.load(requests.get(location - 1));
            }
            e.move();
        }
    }

    public void simulate(int steps) throws InterruptedException {
        for (int i = 0; i < steps; i++) {
            generateRequest();
            schedule();
            elevatorOp();
            Thread.sleep(10);
        }
    }


    private static class SimpleScheduler implements Scheduler {
        @Override
        public void schedule(List<Queue<Integer>> requests, List<Elevator> elevators, int floors) {
            for (Elevator e : elevators) {
                if (e.getLocation() == 0 || e.getLocation() == floors) {
                    e.changeMovingDirection();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SimpleScheduler scheduler = new SimpleScheduler();
        int floors = 10;
        int numElevators = 1;
        List<Queue<Integer>> initialRequests = new ArrayList<Queue<Integer>>();
        for (int i = 0; i < floors; i++) {
            Queue<Integer> curQueue = new LinkedList<>();
            Random generator = new Random();
            int req = generator.nextInt(10);
            curQueue.offer(req);
            initialRequests.add(curQueue);
        }

        Simulator mySimulator = new Simulator(floors, numElevators, scheduler, initialRequests, 14);
        mySimulator.simulate(10);

    }

}