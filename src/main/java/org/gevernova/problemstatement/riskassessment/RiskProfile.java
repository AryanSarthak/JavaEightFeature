package org.gevernova.problemstatement.riskassessment;


class RiskProfile {
    int id;
    String name;
    double score;

    RiskProfile(int id,String name,double score){
        this.id=id;
        this.name=name;
        this.score=score;
    }

    public String toString(){
        return id+" "+name+" "+score;
    }
}
