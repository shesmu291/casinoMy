package com.cko.sampleSpringProject.model;

import javax.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @Column
    private int price;

    @Column
    private int amount;

    public Product(){

    }

    public Product( String name, int price, int amount) {

        this.name = name;
        this.price = price;
        this.amount = amount;
    }


    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }



    public long getId() {
        return id;
    }

    public String getName() { return name; }

    public int getPrice() { return price; }

    public int getAmount() {
        return amount;
    }

}