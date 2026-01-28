package org.gevernova.problemstatement.riskassessment;


import java.util.*;
import java.util.stream.*;

class RiskService {

    // Analyzes policy holders and groups them into high-risk and low-risk profiles
    static void process(List<PolicyHolder> list) {

        // Filter Life insurance holders older than 60, compute risk score, and sort descending
        List<RiskProfile> result =
                list.stream()
                        .filter(p -> p.type.equalsIgnoreCase("Life"))
                        .filter(p -> p.age > 60)
                        .map(p -> new RiskProfile(
                                p.id, p.name, p.premium / p.age))
                        .sorted((a, b) -> Double.compare(b.score, a.score))
                        .toList();

        // Group risk profiles into High Risk and Low Risk based on score threshold 0.5
        Map<String, List<RiskProfile>> map =
                result.stream()
                        .collect(Collectors.groupingBy(
                                r -> r.score > 0.5 ? "High Risk" : "Low Risk"));

        // Print grouped risk profiles
        System.out.println(map);
    }
}

