package org.gevernova.timeapi;


import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;

class BirthdayCountdown {

    // Calculates and prints the number of days until the next birthday
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Read date of birth in ISO format (yyyy-MM-dd)
        LocalDate dob = LocalDate.parse(sc.next());

        // Get today's date
        LocalDate today = LocalDate.now();
        // Calculate next birthday in the current year
        LocalDate next = dob.withYear(today.getYear());

        // If birthday already passed this year, move to next year
        if (next.isBefore(today))
            next = next.plusYears(1);

        // Calculate the number of days between today and next birthday
        long days = ChronoUnit.DAYS.between(today, next);
        System.out.println(days);
    }
}

