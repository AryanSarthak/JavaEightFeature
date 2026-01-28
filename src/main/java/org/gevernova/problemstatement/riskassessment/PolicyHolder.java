package org.gevernova.problemstatement.riskassessment;


class PolicyHolder {
    int id;
    String name;
    int age;
    String type;
    double premium;

    PolicyHolder(int id,String name,int age,String type,double premium){
        this.id=id;
        this.name=name;
        this.age=age;
        this.type=type;
        this.premium=premium;
    }
}

