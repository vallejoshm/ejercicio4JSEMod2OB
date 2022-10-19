package com.clases;

public class Device {

    private String trademark;
    private String model;
    private int yearProduction;
    private String color;
    private double peso;
    private Bateria battery;

    public Device() {
    }

    public Device(String trademark, String model, int yearProduction, String color, double peso, Bateria battery) {
        this.trademark = trademark;
        this.model = model;
        this.yearProduction = yearProduction;
        this.color = color;
        this.peso = peso;
        this.battery = battery;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public void setYearProduction(int yearProduction) {
        this.yearProduction = yearProduction;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Bateria getBattery() {
        return this.battery;
    }

    public void setBattery(Bateria battery) {
        this.battery = battery;
    }
}
