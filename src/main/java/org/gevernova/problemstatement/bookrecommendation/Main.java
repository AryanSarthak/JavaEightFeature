package org.gevernova.problemstatement.bookrecommendation;


import java.util.List;

public class Main {
    public static void main(String[] args){

        List<Book> books = List.of(
                new Book("Dune","Frank","Science Fiction",4.8),
                new Book("Foundation","Isaac","Science Fiction",4.5),
                new Book("1984","Orwell","Drama",4.6)
        );

        System.out.println(RecommendationService.process(books));
    }
}
