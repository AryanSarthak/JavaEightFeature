package org.gevernova.timeapi;


import java.time.*;
import java.time.temporal.*;

class MonthBoundaryFinder {

    // Finds and prints the first and last day of the current month
    public static void main(String[] args) {

        // Get current date
        LocalDate now = LocalDate.now();

        // Find first day of current month
        LocalDate first = now.with(TemporalAdjusters.firstDayOfMonth());
        // Find last day of current month
        LocalDate last = now.with(TemporalAdjusters.lastDayOfMonth());

        System.out.println(first);
        System.out.println(last);
    }
}

