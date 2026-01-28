package org.gevernova.timeapi;

import java.time.*;

class DaylightSavingChecker {

    // Checks if the current date-time is in daylight saving time and prints the result
    public static void main(String[] args) {

        // Get current date-time with time zone
        ZonedDateTime now = ZonedDateTime.now();

        // Check if the current instant is in daylight saving time
        boolean status = now.getZone().getRules().isDaylightSavings(now.toInstant());

        System.out.println(status);
    }
}

