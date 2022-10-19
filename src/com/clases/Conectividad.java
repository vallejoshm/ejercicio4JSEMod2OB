package com.clases;

public class Conectividad {

    private boolean mobileNetwork;
    private boolean wifi;
    private boolean gps;
    private boolean simSlot;
    private boolean bluetooth;

    public Conectividad(){}

    public Conectividad(boolean mobileNetwork, boolean wifi, boolean gps, boolean simSlot,
                        boolean bluetooth) {
        this.mobileNetwork = mobileNetwork;
        this.wifi = wifi;
        this.gps = gps;
        this.simSlot = simSlot;
        this.bluetooth = bluetooth;
    }

    public boolean isMobileNetwork() {
        return mobileNetwork;
    }

    public void setMobileNetwork(boolean mobileNetwork) {
        this.mobileNetwork = mobileNetwork;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public boolean isSimSlot() {
        return simSlot;
    }

    public void setSimSlot(boolean simSlot) {
        this.simSlot = simSlot;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

}
