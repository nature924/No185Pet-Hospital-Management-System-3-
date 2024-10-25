package com.forest.demo.Entity;

import com.forest.demo.Mapper.Forest_PetsMapper;

public class Forest_Customer_PetsEntity {
    private int forest_Customer_Pets_ID;
    private int forest_Customer_ID;
    private int forest_Pets_ID;
    private Forest_PetsEntity pet;
    private Forest_CustomerEntity customer;
    private String forest_Customer_Pets_Time;
    private int num;
    private int size;

    public int getForest_Customer_Pets_ID() {
        return forest_Customer_Pets_ID;
    }

    public void setForest_Customer_Pets_ID(int forest_Customer_Pets_ID) {
        this.forest_Customer_Pets_ID = forest_Customer_Pets_ID;
    }

    public int getForest_Customer_ID() {
        return forest_Customer_ID;
    }

    public void setForest_Customer_ID(int forest_Customer_ID) {
        this.forest_Customer_ID = forest_Customer_ID;
    }

    public int getForest_Pets_ID() {
        return forest_Pets_ID;
    }

    public void setForest_Pets_ID(int forest_Pets_ID) {
        this.forest_Pets_ID = forest_Pets_ID;
    }

    public Forest_PetsEntity getPet() {
        return pet;
    }

    public void setPet(Forest_PetsEntity pet) {
        this.pet = pet;
    }

    public Forest_CustomerEntity getCustomer() {
        return customer;
    }

    public void setCustomer(Forest_CustomerEntity customer) {
        this.customer = customer;
    }

    public String getForest_Customer_Pets_Time() {
        return forest_Customer_Pets_Time;
    }

    public void setForest_Customer_Pets_Time(String forest_Customer_Pets_Time) {
        this.forest_Customer_Pets_Time = forest_Customer_Pets_Time;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
