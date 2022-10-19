package com.clases;

public class Malla {

    private String material;
    private String color;
    private Double meshLength;
    private Double meshWidth;
    private boolean isWaterResistance;
    private Integer waterResistance;
    private boolean useFunction;

    public Malla() {
    }

    public Malla(String material, String color, Double meshLength, Double meshWidth, boolean isWaterResistance,
                 Integer waterResistance, boolean useFunction) {
        this.material = material;
        this.color = color;
        this.meshLength = meshLength;
        this.meshWidth = meshWidth;
        this.isWaterResistance = isWaterResistance;
        this.waterResistance = waterResistance;
        this.useFunction = useFunction;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getMeshLength() {
        return meshLength;
    }

    public void setMeshLength(Double meshLength) {
        this.meshLength = meshLength;
    }

    public Double getMeshWidth() {
        return meshWidth;
    }

    public void setMeshWidth(Double meshWidth) {
        this.meshWidth = meshWidth;
    }

    public boolean isWaterResistance() {
        return isWaterResistance;
    }

    public void setWaterResistance(boolean waterResistance) {
        isWaterResistance = waterResistance;
    }

    public Integer getWaterResistance() {
        return waterResistance;
    }

    public void setWaterResistance(Integer waterResistance) {
        this.waterResistance = waterResistance;
    }

    public boolean isUseFunction() {
        return useFunction;
    }

    public void setUseFunction(boolean useFunction) {
        this.useFunction = useFunction;
    }
}
