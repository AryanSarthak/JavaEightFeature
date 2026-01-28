package org.gevernova.problemstatement.frauddetection;


import java.util.*;
import java.util.stream.*;

class FraudDetector {

    // Detects potential fraudulent transactions and prints alerts for policies exceeding thresholds
    static void process(List<Transaction> list) {

        // Filter fraudulent transactions > 10000 and group by policy
        Map<String, List<Transaction>> map =
                list.stream()
                        .filter(t -> t.fraud)
                        .filter(t -> t.amount > 10000)
                        .collect(Collectors.groupingBy(t -> t.policy));

        // Check each policy: alert if more than 5 transactions or sum > 50000
        map.forEach((k, v) -> {
            long count = v.size();
            double sum = v.stream().mapToDouble(t -> t.amount).sum();

            if (count > 5 || sum > 50000)
                System.out.println("ALERT -> " + k);
        });
    }
}

