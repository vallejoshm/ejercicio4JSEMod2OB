package com.clases;

public class Sensores {

    private boolean accelerometer;
    private boolean barometer;
    private boolean proximity;
    private boolean gyroscope;
    private boolean geomagnetic;
    private boolean compass;
    private boolean opticalHeartRate;

    public Sensores() {}

    public Sensores(boolean accelerometer, boolean barometer, boolean proximity,
                    boolean gyroscope, boolean geomagnetic, boolean compass, boolean opticalHeartRate) {
        this.accelerometer = accelerometer;
        this.barometer = barometer;
        this.proximity = proximity;
        this.gyroscope = gyroscope;
        this.geomagnetic = geomagnetic;
        this.compass = compass;
        this.opticalHeartRate = opticalHeartRate;
    }

    public boolean isAccelerometer() {
        return accelerometer;
    }

    public void setAccelerometer(boolean accelerometer) {
        this.accelerometer = accelerometer;
    }

    public boolean isBarometer() {
        return barometer;
    }

    public void setBarometer(boolean barometer) {
        this.barometer = barometer;
    }

    public boolean isProximity() {
        return proximity;
    }

    public void setProximity(boolean proximity) {
        this.proximity = proximity;
    }

    public boolean isGyroscope() {
        return gyroscope;
    }

    public void setGyroscope(boolean gyroscope) {
        this.gyroscope = gyroscope;
    }

    public boolean isGeomagnetic() {
        return geomagnetic;
    }

    public void setGeomagnetic(boolean geomagnetic) {
        this.geomagnetic = geomagnetic;
    }

    public boolean isCompass() {
        return compass;
    }

    public void setCompass(boolean compass) {
        this.compass = compass;
    }

    public boolean isOpticalHeartRate() {
        return opticalHeartRate;
    }

    public void setOpticalHeartRate(boolean opticalHeartRate) {
        this.opticalHeartRate = opticalHeartRate;
    }
}
