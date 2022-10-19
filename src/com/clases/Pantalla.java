package com.clases;

public class Pantalla {

    private Double width;
    private double height;
    private boolean touchScreen;
    private String screenType;
    private Integer resolutionX;
    private Integer resolutionY;

    public Pantalla() {}

    public Pantalla(Double width, double height, boolean touchScreen, String screenType, Integer resolutionX, Integer resolutionY) {
        this.width = width;
        this.height = height;
        this.touchScreen = touchScreen;
        this.screenType = screenType;
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public Integer getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(Integer resolutionX) {
        this.resolutionX = resolutionX;
    }

    public Integer getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(Integer resolutionY) {
        this.resolutionY = resolutionY;
    }
}
