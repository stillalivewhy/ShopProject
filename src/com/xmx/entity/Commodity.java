package com.xmx.entity;

public class Commodity {
    private int commodityNo;
    private String commodityName;
    private double commodityPrice;

    public int getCommodityNo() {
        return commodityNo;
    }

    public void setCommodityNo(int commodityNo) {
        this.commodityNo = commodityNo;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public double getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(double commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    @Override
    public String toString(){
        return "{" +"commodityNo:"+"\""+this.commodityNo+"\""+","+
                "commodityName:"+"\""+this.commodityName+"\""+","+
                "commodityPrice:"+"\""+this.commodityPrice+"\""+"}";
    }
}
