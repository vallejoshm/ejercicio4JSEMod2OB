package com.clases;

public class SmartPhone extends SmartDevice{


    private String numberPhone;
    private boolean dualSim;
    private String typeSim;
    private String camera;
    private boolean facialRecognition;
    private boolean answerCall;
    private boolean relpyMessage;
    private boolean makeCall;

    public SmartPhone() {
        super();
    }

    public SmartPhone(String trademark, String model, int yearProduction, String color, double peso, Bateria battery,
                      String operatingSystem, Double screenSize, Pantalla screen, Conectividad connectivity,
                      Sensores sensors, boolean appInstallation, boolean notification, boolean receiptMessageApp,
                      boolean receiptCallApp, boolean openMessageApp, String internalMemory, Integer ramMemory,
                      boolean expandableMemory, String numberPhone, boolean dualSim, String typeSim, String camera,
                      boolean facialRecognition, boolean answerCall, boolean relpyMessage, boolean makeCall) {
        super(trademark, model, yearProduction, color, peso, battery, operatingSystem, screenSize, screen, connectivity,
                sensors, appInstallation, notification, receiptMessageApp, receiptCallApp, openMessageApp, internalMemory,
                ramMemory, expandableMemory);
        this.numberPhone = numberPhone;
        this.dualSim = dualSim;
        this.typeSim = typeSim;
        this.camera = camera;
        this.facialRecognition = facialRecognition;
        this.answerCall = answerCall;
        this.relpyMessage = relpyMessage;
        this.makeCall = makeCall;
    }
}
