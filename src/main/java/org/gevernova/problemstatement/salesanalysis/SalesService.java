package org.gevernova.problemstatement.salesanalysis;


import java.util.*;
import java.util.stream.*;

class SalesService {

    // Analyzes sales data and prints top 5 products by revenue (for quantity > 10)
    static void process(List<Sale> list) {

        // Filter sales with quantity > 10, calculate total revenue per product, sort and limit top 5
        List<ProductRevenue> result =
                list.stream()
                        .filter(s -> s.quantity > 10)
                        .collect(Collectors.groupingBy(
                                s -> s.productId,
                                Collectors.summingDouble(s -> s.quantity * s.price)))
                        .entrySet()
                        .stream()
                        .map(e -> new ProductRevenue(e.getKey(), e.getValue()))
                        .sorted((a, b) -> Double.compare(b.revenue, a.revenue))
                        .limit(5)
                        .toList();

        // Print top 5 product revenues
        System.out.println(result);
    }
}

