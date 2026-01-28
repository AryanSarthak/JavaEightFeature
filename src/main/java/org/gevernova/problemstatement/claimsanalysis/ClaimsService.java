package org.gevernova.problemstatement.claimsanalysis;

import java.util.*;
import java.util.stream.*;

class ClaimsService {

    // Analyzes claims and prints top 3 policies by total approved claim amounts over 5000
    static void process(List<Claim> list) {

        // Filter approved claims > 5000 and summarize claim amounts grouped by policy number
        Map<String, DoubleSummaryStatistics> stats =
                list.stream()
                        .filter(c -> c.status.equalsIgnoreCase("Approved"))
                        .filter(c -> c.claimAmount > 5000)
                        .collect(Collectors.groupingBy(
                                c -> c.policyNumber,
                                Collectors.summarizingDouble(c -> c.claimAmount)));

        // Sort policies by total claim amount in descending order, limit top 3, and print
        stats.entrySet()
                .stream()
                .sorted((a, b) -> Double.compare(
                        b.getValue().getSum(),
                        a.getValue().getSum()))
                .limit(3)
                .forEach(System.out::println);
    }
}

