package com.forest.demo.Entity;


public class Forest_DiagnosisEntity {
    private int forest_Diagnosis_ID;
    private int forest_Diagnosis_Style;
    private String forest_Diagnosis_Detail;
    private int forest_Pets_ID;
    private int forest_VetDoctor_ID;
    private String  forest_Diagnosis_Time;
    private Forest_PetsEntity pet;
    private Forest_VetDoctorEntity doctor;
    private int num;
    private int size;
    private String forest_VetDoctor_Card;
    private String forest_VetDoctor_Name;
    private int forest_Customer_ID;

    public int getForest_Diagnosis_ID() {
        return forest_Diagnosis_ID;
    }

    public void setForest_Diagnosis_ID(int forest_Diagnosis_ID) {
        this.forest_Diagnosis_ID = forest_Diagnosis_ID;
    }

    public int getForest_Diagnosis_Style() {
        return forest_Diagnosis_Style;
    }

    public void setForest_Diagnosis_Style(int forest_Diagnosis_Style) {
        this.forest_Diagnosis_Style = forest_Diagnosis_Style;
    }

    public String getForest_Diagnosis_Detail() {
        return forest_Diagnosis_Detail;
    }

    public void setForest_Diagnosis_Detail(String forest_Diagnosis_Detail) {
        this.forest_Diagnosis_Detail = forest_Diagnosis_Detail;
    }

    public int getForest_Pets_ID() {
        return forest_Pets_ID;
    }

    public void setForest_Pets_ID(int forest_Pets_ID) {
        this.forest_Pets_ID = forest_Pets_ID;
    }

    public int getForest_VetDoctor_ID() {
        return forest_VetDoctor_ID;
    }

    public void setForest_VetDoctor_ID(int forest_VetDoctor_ID) {
        this.forest_VetDoctor_ID = forest_VetDoctor_ID;
    }

    public String getForest_Diagnosis_Time() {
        return forest_Diagnosis_Time;
    }

    public void setForest_Diagnosis_Time(String forest_Diagnosis_Time) {
        this.forest_Diagnosis_Time = forest_Diagnosis_Time;
    }

    public Forest_PetsEntity getPet() {
        return pet;
    }

    public void setPet(Forest_PetsEntity pet) {
        this.pet = pet;
    }

    public Forest_VetDoctorEntity getDoctor() {
        return doctor;
    }

    public void setDoctor(Forest_VetDoctorEntity doctor) {
        this.doctor = doctor;
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

    public String getForest_VetDoctor_Card() {
        return forest_VetDoctor_Card;
    }

    public void setForest_VetDoctor_Card(String forest_VetDoctor_Card) {
        this.forest_VetDoctor_Card = forest_VetDoctor_Card;
    }

    public String getForest_VetDoctor_Name() {
        return forest_VetDoctor_Name;
    }

    public void setForest_VetDoctor_Name(String forest_VetDoctor_Name) {
        this.forest_VetDoctor_Name = forest_VetDoctor_Name;
    }

    public int getForest_Customer_ID() {
        return forest_Customer_ID;
    }

    public void setForest_Customer_ID(int forest_Customer_ID) {
        this.forest_Customer_ID = forest_Customer_ID;
    }
}
