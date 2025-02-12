package com.springwebtest.springwebtest.model;

public class product {
    private int prodId;
    private String prodName;
    private int price;

    /* constructor */
    public product(int prodId, String prodName, int price) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
    }

    /* getters and setters */
    public int getProdId() {
        return prodId;
    }    
    public void setProdId(int prodId) {
        this.prodId = prodId;
    }
    public String getProdName() {
        return prodName;
    }
    public void setProdName(String prodName) {
        this.prodName = prodName;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
