package org.gevernova.timeapi;


import java.time.*;

class ExecutionTimer {

    // Measures and prints the execution time in seconds for a code block
    public static void main(String[] args) {

        // Record start time
        Instant start = Instant.now();

        // Sample code block to measure
        for(int i = 0; i < 1000000; i++);

        // Record end time
        Instant end = Instant.now();

        // Calculate and print the duration in seconds
        System.out.println(Duration.between(start, end).getSeconds());
    }
}

