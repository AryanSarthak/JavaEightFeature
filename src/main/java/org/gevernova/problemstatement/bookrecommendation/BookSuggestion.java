package org.gevernova.problemstatement.bookrecommendation;


class BookSuggestion {
    String title;
    double rating;

    BookSuggestion(String title,double rating){
        this.title=title;
        this.rating=rating;
    }

    public String toString(){
        return title+" "+rating;
    }
}

