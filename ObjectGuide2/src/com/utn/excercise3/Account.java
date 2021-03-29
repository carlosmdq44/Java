package com.utn.excercise3;
import java.util.Arrays;
import java.util.UUID;

public class Account {

    private static final int MAX_OPS=10; /// declaro maximo 10 operaciones

    private UUID uuid;
    private ClientAccount client;
    private double balance;
    private int contadorOperaciones=0;
    private String operaciones[] = new String[MAX_OPS];

    public Account(){
    }

    public Account(ClientAccount client,double balance){
        this.uuid=UUID.randomUUID();
        this.client=client;
        this.balance=balance;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public ClientAccount getClient() {
        return client;
    }

    public void setClient(ClientAccount client) {
        this.client = client;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getContadorOperaciones() {
        return contadorOperaciones;
    }

    public void setContadorOperaciones(int contadorOperaciones) {
        this.contadorOperaciones = contadorOperaciones;
    }

    public String[] getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(String[] operaciones) {
        this.operaciones = operaciones;
    }

    public double depositar(double monto) {
        documentarDeposito(monto);
        return this.balance += monto;
    }

    public double extraer(double monto) {
        double tempBalance = this.balance - monto;
        if (tempBalance >= -2000) {
            this.balance -= monto;
            documentarRetiro(monto);
        } else {
            System.out.println("Monto insuficiente");
        }
        return this.balance;
    }

    private void documentarDeposito(double monto) {
        if (this.contadorOperaciones == MAX_OPS) {
            this.contadorOperaciones = 0;
        }
        operaciones[contadorOperaciones] = "El cliente " + ", depositó " + monto;
        this.contadorOperaciones++;
    }

    private void documentarRetiro(double monto) {
        if (this.contadorOperaciones == 10) {
            this.contadorOperaciones = 0;
        }
        operaciones[contadorOperaciones] = "El cliente" + ", retiró " + monto;
        this.contadorOperaciones++;
    }

    @Override
    public String toString() {
        return "Account{" +
                "uuid=" + uuid +
                ", client=" + client +
                ", balance=" + balance +
                '}';
    }
}

