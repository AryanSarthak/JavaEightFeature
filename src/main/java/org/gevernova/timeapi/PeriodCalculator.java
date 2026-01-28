package org.gevernova.timeapi;

import java.time.*;
import java.util.*;

class PeriodCalculator {

    // Calculates and prints the period between two dates in years, months, and days
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read two dates in ISO format (yyyy-MM-dd)
        LocalDate d1 = LocalDate.parse(sc.next());
        LocalDate d2 = LocalDate.parse(sc.next());

        // Calculate the period between the two dates
        Period p = Period.between(d1, d2);

        // Print the period in years, months, and days
        System.out.println(p.getYears() + " Years " + p.getMonths() + " Months " + p.getDays() + " Days");
    }
}


