package com.clases;

import java.time.LocalDateTime;

public class SmartWatch extends SmartDevice{

    private LocalDateTime dataTime;
    private boolean screenLock;
    private boolean activateSensors;
    private Malla mesh;
    private boolean isWaterResistance;
    private Integer waterResistMetersMax;

    public SmartWatch() {
        super();
    }

    public SmartWatch(String trademark, String model, int yearProduction, String color, double peso, Bateria battery,
                      String operatingSystem, Double screenSize, Pantalla screen, Conectividad connectivity,
                      Sensores sensors, boolean appInstallation, boolean notification, boolean receiptMessageApp,
                      boolean receiptCallApp, boolean openMessageApp, String internalMemory, Integer ramMemory,
                      boolean expandableMemory, LocalDateTime dataTime, boolean screenLock, boolean activateSensors,
                      Malla mesh, boolean isWaterResistance, Integer waterResistMetersMax) {
        super(trademark, model, yearProduction, color, peso, battery, operatingSystem, screenSize, screen, connectivity,
                sensors, appInstallation, notification, receiptMessageApp, receiptCallApp, openMessageApp, internalMemory,
                ramMemory, expandableMemory);
        this.dataTime = dataTime;
        this.screenLock = screenLock;
        this.activateSensors = activateSensors;
        this.mesh = mesh;
        this.isWaterResistance = isWaterResistance;
        this.waterResistMetersMax = waterResistMetersMax;
    }

    public LocalDateTime getDataTime() {
        return dataTime;
    }

    public void setDataTime(LocalDateTime dataTime) {
        this.dataTime = dataTime;
    }

    public boolean isScreenLock() {
        return screenLock;
    }

    public void setScreenLock(boolean screenLock) {
        this.screenLock = screenLock;
    }

    public boolean isActivateSensors() {
        return activateSensors;
    }

    public void setActivateSensors(boolean activateSensors) {
        this.activateSensors = activateSensors;
    }

    public Malla getMesh() {
        return mesh;
    }

    public void setMesh(Malla mesh) {
        this.mesh = mesh;
    }

    public boolean isWaterResistance() {
        return isWaterResistance;
    }

    public void setWaterResistance(boolean waterResistance) {
        isWaterResistance = waterResistance;
    }

    public Integer getWaterResistMetersMax() {
        return waterResistMetersMax;
    }

    public void setWaterResistMetersMax(Integer waterResistMetersMax) {
        this.waterResistMetersMax = waterResistMetersMax;
    }
}
