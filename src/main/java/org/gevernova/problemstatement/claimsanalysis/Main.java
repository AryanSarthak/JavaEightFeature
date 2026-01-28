package org.gevernova.problemstatement.claimsanalysis;


import java.util.List;

public class Main {
    public static void main(String[] args){

        List<Claim> list = List.of(
                new Claim(1,"P100",7000,"2024","Approved"),
                new Claim(2,"P100",12000,"2024","Approved"),
                new Claim(3,"P101",9000,"2024","Approved")
        );

        ClaimsService.process(list);
    }
}