package com.roman.AISD_LAB1.entity;

public class Floor {
    private int floorEndFlag;
    private int[][] field;

    public Floor(int floorEndFlag, int[][] field) {
        this.floorEndFlag = floorEndFlag;
        this.field = field;
    }

    public int getFloorEndFlag() {
        return floorEndFlag;
    }

    public void setFloorEndFlag(int floorEndFlag) {
        this.floorEndFlag = floorEndFlag;
    }

    public int[][] getField() {
        return field;
    }

    public void setField(int[][] field) {
        this.field = field;
    }
}
