package com.utn.excercise3;
import java.util.Arrays;
import java.util.UUID;

public class ClientAccount {
    private UUID uuid;
    private String name;
    private char gender;

    public ClientAccount(){
    }

    public ClientAccount(String name,char gender){
        this.uuid=UUID.randomUUID();
        this.name=name;
        this.gender=gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "ClientAccount{" +
                "uuid=" + uuid +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
