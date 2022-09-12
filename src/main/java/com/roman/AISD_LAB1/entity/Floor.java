package com.roman.AISD_LAB1.entity;

public class Floor {
    private int number; //todo
    private int[][] field;
    private Marker marker;  //todo
    private Marker oldMarker;  //todo

    public Floor(int number, int[][] field, Marker Marker, Marker oldMarker) {
        this.number = number;
        this.field = field;
        this.marker = Marker;
        this.oldMarker = oldMarker;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int[][] getField() {
        return field;
    }

    public void setField(int[][] field) {
        this.field = field;
    }

    public Marker getMarker() {
        return marker;
    }

    public void setMarker(Marker marker) {
        this.marker = marker;
    }

    public Marker getOldMarker() {
        return oldMarker;
    }

    public void setOldMarker(Marker oldMarker) {
        this.oldMarker = oldMarker;
    }
}
