package chapter15_pattern_application_elevator;

import java.util.List;
import java.util.Queue;

public interface Scheduler {
    //given the statue of the system, update elevator states
    void schedule(List<Queue<Integer>> requests, List<Elevator> elevators, int floors);
}
