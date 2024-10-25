package com.forest.demo.Entity;


public class Forest_HistoryRecordEntity {
    private int forest_HistoryRecord_ID;
    private int forest_User_ID;
    private int forest_Pets_ID;
    private Forest_PetsEntity pet;
    private Forest_userEntity user;
    private String forest_User_Pets_Time;
    private int num;
    private int size;
    private String forest_User_Name;

    public int getForest_HistoryRecord_ID() {
        return forest_HistoryRecord_ID;
    }

    public void setForest_HistoryRecord_ID(int forest_HistoryRecord_ID) {
        this.forest_HistoryRecord_ID = forest_HistoryRecord_ID;
    }

    public int getForest_User_ID() {
        return forest_User_ID;
    }

    public void setForest_User_ID(int forest_User_ID) {
        this.forest_User_ID = forest_User_ID;
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

    public Forest_userEntity getUser() {
        return user;
    }

    public void setUser(Forest_userEntity user) {
        this.user = user;
    }

    public String getForest_User_Pets_Time() {
        return forest_User_Pets_Time;
    }

    public void setForest_User_Pets_Time(String forest_User_Pets_Time) {
        this.forest_User_Pets_Time = forest_User_Pets_Time;
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

    public String getForest_User_Name() {
        return forest_User_Name;
    }

    public void setForest_User_Name(String forest_User_Name) {
        this.forest_User_Name = forest_User_Name;
    }
}
