package org.gevernova.problemstatement.frauddetection;


class Transaction {
    int id;
    String policy;
    double amount;
    boolean fraud;

    Transaction(int id,String policy,double amount,boolean fraud){
        this.id=id;
        this.policy=policy;
        this.amount=amount;
        this.fraud=fraud;
    }
}

