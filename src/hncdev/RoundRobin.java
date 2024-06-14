package hncdev;

import java.util.LinkedList;
import java.util.Queue;

class Process {
    int id;
    int burstTime;
    int remainingTime;

    public Process(int id, int burstTime) {
        this.id = id;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
    }
}

public class RoundRobin {

    public static void main(String[] args) {
        int timeQuantum = 4; // Time quantum
        Queue<Process> processQueue = new LinkedList<>();

        // Add processes to the queue
        processQueue.add(new Process(1, 10));
        processQueue.add(new Process(2, 5));
        processQueue.add(new Process(3, 8));

        // Perform Round Robin Scheduling
        roundRobinScheduling(processQueue, timeQuantum);
    }

    public static void roundRobinScheduling(Queue<Process> processQueue, int timeQuantum) {
        int currentTime = 0;

        while (!processQueue.isEmpty()) {
            Process currentProcess = processQueue.poll();
            int executionTime = Math.min(currentProcess.remainingTime, timeQuantum);

            currentTime += executionTime;
            currentProcess.remainingTime -= executionTime;

            System.out.println("Process " + currentProcess.id + " executed for " + executionTime + " units. Time: "
                    + currentTime);

            if (currentProcess.remainingTime > 0) {
                processQueue.add(currentProcess);
            } else {
                System.out.println("Process " + currentProcess.id + " finished. Total Time: " + currentTime);
            }
        }
    }
}
