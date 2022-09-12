package com.roman.AISD_LAB1.service;

import com.roman.AISD_LAB1.entity.Directions;
import com.roman.AISD_LAB1.entity.Floor;
import com.roman.AISD_LAB1.entity.Marker;

public class LabyrinthService {
    public Directions direction;  //todo

    public void up(Floor floor, Marker marker) throws InterruptedException {
        if (floor.getField()[floor.getMarker().getI()][floor.getMarker().getJ() - 1] != 1){

            setOldMarker(floor);

            floor.getMarker().setJ(floor.getMarker().getJ() - 1);

            direction = Directions.RIGHT;

            checkEndFloor(floor);

            printNewLabyrinth(floor);
            Thread.sleep(1500);
        } else if (floor.getField()[floor.getMarker().getI() + 1][floor.getMarker().getJ()] != 1){
            setOldMarker(floor);

            floor.getMarker().setI(floor.getMarker().getI() + 1);

            checkEndFloor(floor);

            direction = Directions.UP;

            printNewLabyrinth(floor);
            Thread.sleep(1500);
        } else if (floor.getField()[floor.getMarker().getI()][floor.getMarker().getJ() + 1] != 1) {
            setOldMarker(floor);

            floor.getMarker().setJ(floor.getMarker().getJ() + 1);

            checkEndFloor(floor);

            direction = Directions.LEFT;

            printNewLabyrinth(floor);
            Thread.sleep(1500);

            checkEndFloor(floor);
        } else if (floor.getField()[floor.getMarker().getI() - 1][floor.getMarker().getJ()] != 1){
            setOldMarker(floor);

            floor.getMarker().setI(floor.getMarker().getI() - 1);

            checkEndFloor(floor);

            direction = Directions.DOWN;

            printNewLabyrinth(floor);
            Thread.sleep(1500);

            checkEndFloor(floor);
        }
    }

    public void down(Floor floor) throws InterruptedException {
        if ((floor.getField()[floor.getMarker().getI()][floor.getMarker().getJ() + 1] == 0) ||
                (floor.getField()[floor.getMarker().getI()][floor.getMarker().getJ() + 1] == 9)){
            setOldMarker(floor);

            floor.getMarker().setJ(floor.getMarker().getJ() + 1);

            direction = Directions.LEFT;

            checkEndFloor(floor);

            printNewLabyrinth(floor);
            Thread.sleep(1500);
        } else if (floor.getField()[floor.getMarker().getI() - 1][floor.getMarker().getJ()] != 1){
            setOldMarker(floor);

            floor.getMarker().setI(floor.getMarker().getI() - 1);

            direction = Directions.DOWN;

            checkEndFloor(floor);

            printNewLabyrinth(floor);
            Thread.sleep(1500);
        } else if (floor.getField()[floor.getMarker().getI()][floor.getMarker().getJ() - 1] != 1) {
            setOldMarker(floor);

            floor.getMarker().setJ(floor.getMarker().getJ() - 1);

            direction = Directions.RIGHT;

            checkEndFloor(floor);

            printNewLabyrinth(floor);
            Thread.sleep(1500);

            checkEndFloor(floor);
        } else if (floor.getField()[floor.getMarker().getI() + 1][floor.getMarker().getJ()] != 1) {
            setOldMarker(floor);

            floor.getMarker().setI(floor.getMarker().getI() + 1);

            direction = Directions.UP;

            checkEndFloor(floor);

            printNewLabyrinth(floor);
            Thread.sleep(1500);

            checkEndFloor(floor);
        }
    }

    public void right(Floor floor) throws InterruptedException {
        if (floor.getField()[floor.getMarker().getI() - 1][floor.getMarker().getJ()] != 1) {
            setOldMarker(floor);

            floor.getMarker().setI(floor.getMarker().getI() - 1);

            direction = Directions.DOWN;

            checkEndFloor(floor);

            printNewLabyrinth(floor);
            Thread.sleep(1500);

            return;
        } else if (floor.getField()[floor.getMarker().getI()][floor.getMarker().getJ() - 1] != 1) {
            setOldMarker(floor);

            floor.getMarker().setJ(floor.getMarker().getJ() - 1);

            direction = Directions.RIGHT;

            checkEndFloor(floor);

            printNewLabyrinth(floor);
            Thread.sleep(1500);
        } else if (floor.getField()[floor.getMarker().getI() - 1][floor.getMarker().getJ()] !=1 ) {
            setOldMarker(floor);

            floor.getMarker().setI(floor.getMarker().getI() - 1);

            direction = Directions.UP;

            checkEndFloor(floor);

            printNewLabyrinth(floor);
            Thread.sleep(1500);

            return;
        } else if (floor.getField()[floor.getMarker().getI()][floor.getMarker().getJ() + 1] != 1) {
            setOldMarker(floor);

            floor.getMarker().setJ(floor.getMarker().getJ() + 1);

            direction = Directions.LEFT;

            checkEndFloor(floor);

            printNewLabyrinth(floor);
            Thread.sleep(1500);

            return;
        }
    }

    public void left(Floor floor) throws InterruptedException {
        if (floor.getField()[floor.getMarker().getI() + 1][floor.getMarker().getJ()] != 1) {
            setOldMarker(floor);

            floor.getMarker().setI(floor.getMarker().getI() + 1);

            direction = Directions.UP;

            checkEndFloor(floor);

            printNewLabyrinth(floor);
            Thread.sleep(1500);

            return;
        } else if (floor.getField()[floor.getMarker().getI()][floor.getMarker().getJ() + 1] != 1) {
            setOldMarker(floor);

            floor.getMarker().setJ(floor.getMarker().getJ() + 1);

            direction = Directions.LEFT;

            checkEndFloor(floor);

            printNewLabyrinth(floor);
            Thread.sleep(1500);

            return;
        } else if (floor.getField()[floor.getMarker().getI() - 1][floor.getMarker().getJ()] != 1) {
            setOldMarker(floor);

            floor.getMarker().setI(floor.getMarker().getI() - 1);

            direction = Directions.DOWN;

            checkEndFloor(floor);

            printNewLabyrinth(floor);
            Thread.sleep(1500);

            return;
        } else if (floor.getField()[floor.getMarker().getI()][floor.getMarker().getJ() - 1] != 1){
            setOldMarker(floor);

            floor.getMarker().setJ(floor.getMarker().getJ() - 1);

            direction = Directions.RIGHT;

            checkEndFloor(floor);

            printNewLabyrinth(floor);
            Thread.sleep(1500);

            return;
        }
    }

    public void setOldMarker(Floor floor) {
        floor.getOldMarker().setI(floor.getMarker().getI());
        floor.getOldMarker().setJ(floor.getMarker().getJ());
    }

    public void checkEndFloor(Floor floor) {
        if (floor.getField()[floor.getMarker().getI()][floor.getMarker().getJ()] == 9) {
            floor.setNumber(0);
        }
    }

    public void printNewLabyrinth(Floor floor) {
        floor.getField()[floor.getOldMarker().getI()][floor.getOldMarker().getJ()] = 0;
        floor.getField()[floor.getMarker().getI()][floor.getMarker().getJ()] = 3;

        System.out.println();

        for (int i = 0; i < floor.getField().length; i++) {
            for (int j = 0; j < floor.getField()[i].length; j++) {
                System.out.print (floor.getField()[i][j] + " ");
            }
            System.out.println();
        }
    }
}
