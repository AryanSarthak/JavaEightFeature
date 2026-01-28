package org.gevernova.problemstatement.salesanalysis;


import java.util.List;

public class Main {
    public static void main(String[] args){

        List<Sale> list = List.of(
                new Sale(101,15,100),
                new Sale(102,20,200),
                new Sale(103,30,50)
        );

        SalesService.process(list);
    }
}
