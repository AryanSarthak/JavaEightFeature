package org.gevernova.timeapi;

import java.time.*;

class LeapYearChecker {
    public static void main(String[] args) {

        int year = Year.now().getValue();
        System.out.println(Year.isLeap(year));
    }
}

