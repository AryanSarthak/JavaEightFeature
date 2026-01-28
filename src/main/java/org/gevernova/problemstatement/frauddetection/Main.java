package org.gevernova.problemstatement.frauddetection;


import java.util.List;

public class Main {
    public static void main(String[] args){

        List<Transaction> list = List.of(
                new Transaction(1,"P100",15000,true),
                new Transaction(2,"P100",20000,true),
                new Transaction(3,"P100",18000,true),
                new Transaction(4,"P100",12000,true),
                new Transaction(5,"P100",16000,true),
                new Transaction(6,"P100",11000,true)
        );

        FraudDetector.process(list);
    }
}
