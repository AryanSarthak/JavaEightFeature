package org.gevernova.timeapi;


import java.time.*;
import java.time.format.*;
import java.util.*;

class DateFormatConverter {

    // Converts a date string from one format to another and prints it
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input date string
        String input = sc.next();

        // Input format pattern
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        // Output format pattern
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Parse input string to LocalDate using f1
        LocalDate date = LocalDate.parse(input, f1);
        // Format LocalDate using f2 and print
        System.out.println(date.format(f2));
    }
}

