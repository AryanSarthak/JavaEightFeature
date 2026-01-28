package org.gevernova.timeapi;

import java.time.*;
import java.util.*;

class TimeZoneConverter {

    // Converts a LocalDateTime from one time zone to another and prints the result
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read date-time string and source & target time zones
        String dateTime = sc.nextLine();
        String fromZone = sc.next();
        String toZone = sc.next();

        // Parse input date-time
        LocalDateTime ldt = LocalDateTime.parse(dateTime);

        // Apply source time zone
        ZonedDateTime z1 = ldt.atZone(ZoneId.of(fromZone));
        // Convert to target time zone
        ZonedDateTime z2 = z1.withZoneSameInstant(ZoneId.of(toZone));

        System.out.println(z2);
    }
}

