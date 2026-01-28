package org.gevernova.problemstatement.riskassessment;


import java.util.List;

public class Main {
    public static void main(String[] args){

        List<PolicyHolder> list = List.of(
                new PolicyHolder(1,"Raj",65,"Life",50000),
                new PolicyHolder(2,"Aman",70,"Life",60000)
        );

        RiskService.process(list);
    }
}
