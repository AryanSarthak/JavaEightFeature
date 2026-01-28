package org.gevernova.problemstatement.salesanalysis;


class ProductRevenue {
    int productId;
    double revenue;

    ProductRevenue(int productId,double revenue){
        this.productId=productId;
        this.revenue=revenue;
    }

    public String toString(){
        return productId+" -> "+revenue;
    }
}

