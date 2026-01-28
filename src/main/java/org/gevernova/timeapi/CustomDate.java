package org.gevernova.timeapi;


import java.time.*;
import java.time.format.*;
import java.util.*;

class CustomDate {

    // Reads a date-time string in one format and prints it in another format
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Read date-time string from user
        String input = sc.nextLine();

        // Input format pattern
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
        // Output format pattern
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");

        // Parse input string to LocalDateTime using f1
        LocalDateTime dt = LocalDateTime.parse(input, f1);
        // Format LocalDateTime using f2 and print
        System.out.println(dt.format(f2));
    }
}

