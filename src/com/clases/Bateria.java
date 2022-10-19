package com.clases;

public class Bateria {

    private Integer capacidad;
    private String type;
    private String batteryLife;
    private String chargerType;

    public Bateria(){}

    public Bateria(Integer capacidad, String type, String batteryLife, String chargerType) {
        this.capacidad = capacidad;
        this.type = type;
        this.batteryLife = batteryLife;
        this.chargerType = chargerType;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(String batteryLife) {
        this.batteryLife = batteryLife;
    }

    public String isChargerType() {
        return chargerType;
    }

    public void setChargerType(String chargerType) {
        this.chargerType = chargerType;
    }
}
