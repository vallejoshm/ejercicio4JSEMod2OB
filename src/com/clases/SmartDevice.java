package com.clases;

public class SmartDevice extends Device {

    private String operatingSystem;
    private Double screenSize;
    private Pantalla screen;
    private Conectividad connectivity;
    private Sensores sensors;
    private boolean appInstallation;
    private boolean notification;
    private boolean receiptMessageApp;
    private boolean receiptCallApp;
    private boolean openMessageApp;
    private String internalMemory;
    private Integer ramMemory;
    private boolean expandableMemory;

    public SmartDevice() {
        super();
    }

    public SmartDevice(String trademark, String model, int yearProduction, String color, double peso,
                       Bateria battery, String operatingSystem, Double screenSize, Pantalla screen,
                       Conectividad connectivity, Sensores sensors, boolean appInstallation,
                       boolean notification, boolean receiptMessageApp, boolean receiptCallApp,
                       boolean openMessageApp, String internalMemory, Integer ramMemory, boolean expandableMemory) {
        super(trademark, model, yearProduction, color, peso, battery);
        this.operatingSystem = operatingSystem;
        this.screenSize = screenSize;
        this.screen = screen;
        this.connectivity = connectivity;
        this.sensors = sensors;
        this.appInstallation = appInstallation;
        this.notification = notification;
        this.receiptMessageApp = receiptMessageApp;
        this.receiptCallApp = receiptCallApp;
        this.openMessageApp = openMessageApp;
        this.internalMemory = internalMemory;
        this.ramMemory = ramMemory;
        this.expandableMemory = expandableMemory;
    }

    public String getInternalMemory() {
        return internalMemory;
    }

    public void setInternalMemory(String internalMemory) {
        this.internalMemory = internalMemory;
    }

    public boolean isExpandableMemory() {
        return expandableMemory;
    }

    public void setExpandableMemory(boolean expandableMemory) {
        this.expandableMemory = expandableMemory;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public Double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(Double screenSize) {
        this.screenSize = screenSize;
    }

    public Pantalla getScreen() {
        return screen;
    }

    public void setScreen(Pantalla screen) {
        this.screen = screen;
    }

    public Conectividad getConnectivity() {
        return connectivity;
    }

    public void setConnectivity(Conectividad connectivity) {
        this.connectivity = connectivity;
    }

    public Sensores getSensors() {
        return sensors;
    }

    public void setSensors(Sensores sensors) {
        this.sensors = sensors;
    }

    public boolean isAppInstallation() {
        return appInstallation;
    }

    public void setAppInstallation(boolean appInstallation) {
        this.appInstallation = appInstallation;
    }

    public boolean isNotification() {
        return notification;
    }

    public void setNotification(boolean notification) {
        this.notification = notification;
    }

    public boolean isReceiptMessageApp() {
        return receiptMessageApp;
    }

    public void setReceiptMessageApp(boolean receiptMessageApp) {
        this.receiptMessageApp = receiptMessageApp;
    }

    public boolean isReceiptCallApp() {
        return receiptCallApp;
    }

    public void setReceiptCallApp(boolean receiptCallApp) {
        this.receiptCallApp = receiptCallApp;
    }

    public boolean isOpenMessageApp() {
        return openMessageApp;
    }

    public void setOpenMessageApp(boolean openMessageApp) {
        this.openMessageApp = openMessageApp;
    }

    public Integer getRamMemory() { return ramMemory; }

    public void setRamMemory(Integer ramMemory) { this.ramMemory = ramMemory; }
}
