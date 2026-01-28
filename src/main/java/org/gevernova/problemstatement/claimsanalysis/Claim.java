package org.gevernova.problemstatement.claimsanalysis;


class Claim {
    int claimId;
    String policyNumber;
    double claimAmount;
    String claimDate;
    String status;

    Claim(int id,String policy,double amount,String date,String status){
        this.claimId=id;
        this.policyNumber=policy;
        this.claimAmount=amount;
        this.claimDate=date;
        this.status=status;
    }
}

