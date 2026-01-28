package org.gevernova.timeapi;

import java.time.*;

class TimeZoneDifference {

    // Calculates and prints the time difference between UTC and local time zone
    public static void main(String[] args) {

        // Current time in UTC
        ZonedDateTime utc = ZonedDateTime.now(ZoneId.of("UTC"));
        // Current local time
        ZonedDateTime local = ZonedDateTime.now();

        // Calculate duration between UTC and local time
        Duration d = Duration.between(utc, local);

        // Print difference in hours and minutes
        System.out.println(d.toHours() + " Hours " + d.toMinutesPart() + " Minutes");
    }
}

