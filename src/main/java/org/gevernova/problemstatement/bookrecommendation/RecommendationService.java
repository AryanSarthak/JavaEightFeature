package org.gevernova.problemstatement.bookrecommendation;


import java.util.*;
import java.util.stream.*;

class RecommendationService {

    // Processes a list of books and returns top-rated Science Fiction books in batches of 5
    static List<List<BookSuggestion>> process(List<Book> list) {

        // Filter Science Fiction books with rating > 4.0, map to BookSuggestion, sort by rating, limit to 10
        List<BookSuggestion> result =
                list.stream()
                        .filter(b -> b.genre.equalsIgnoreCase("Science Fiction"))
                        .filter(b -> b.rating > 4.0)
                        .map(b -> new BookSuggestion(b.title, b.rating))
                        .sorted((a, b) -> Double.compare(b.rating, a.rating))
                        .limit(10)
                        .toList();

        // Group the top books into sublists of 5 for display or recommendation batches
        return IntStream.range(0, result.size())
                .boxed()
                .collect(Collectors.groupingBy(i -> i / 5))
                .values()
                .stream()
                .map(l -> l.stream().map(result::get).toList())
                .toList();
    }
}

