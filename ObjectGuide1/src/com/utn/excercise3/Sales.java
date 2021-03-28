package com.utn.excercise3;

public class Sales {
    private int id;
    private String description;
    private double amount;
    private double unitaryPrice;
    private double totalPrice;

    public Sales(){
    }

    public Sales(int id, String description,double amount,double unitaryPrice,double totalPrice){
        this.id=id;
        this.description=description;
        this.amount=amount;
        this.unitaryPrice=unitaryPrice;
        this.totalPrice=totalPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getUnitaryPrice() {
        return unitaryPrice;
    }

    public void setUnitaryPrice(double unitaryPrice) {
        this.unitaryPrice = unitaryPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double total(){
        return this.unitaryPrice *this.amount;
    }
    @Override
    public String toString() {
        return "Sales{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                ", unitaryPrice=" + unitaryPrice +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
