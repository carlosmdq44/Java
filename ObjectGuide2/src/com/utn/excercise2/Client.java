package com.utn.excercise2;
import java.util.UUID;

public class Client {
    private UUID uuid;
    private String name;
    private String email;
    private double discountPorcent;

    public Client (String name,String email,double discountPorcent){
        this.uuid=UUID.randomUUID();
        this.name=name;
        this.email=email;
        this.discountPorcent=discountPorcent;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getDiscountPorcent() {
        return discountPorcent;
    }

    public void setDiscountPorcent(double discountPorcent) {
        this.discountPorcent = discountPorcent;
    }

    @Override
    public String toString() {
        return "Client{" +
                "uuid=" + uuid +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", discountPorcent=" + discountPorcent +
                '}';
    }
}

