package com.utn.excercise2;
import com.utn.excercise2.ItemSale;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.UUID;

public class Bill {
    private UUID uuid;
    private LocalDateTime date;
    private Client client;
    private ItemSale[] items;

    public Bill(Client client, ItemSale[] items) {
        this.uuid = UUID.randomUUID();
        this.date = LocalDateTime.now();
        this.client = client;
        this.items = items;
    }
}