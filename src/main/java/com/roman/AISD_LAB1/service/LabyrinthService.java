package com.roman.AISD_LAB1.service;

import com.roman.AISD_LAB1.entity.enums.Directions;
import com.roman.AISD_LAB1.entity.Floor;
import com.roman.AISD_LAB1.entity.Marker;

public class LabyrinthService {
    public Directions direction;

    public void solveLabyrinth(Floor[] floorArray, Marker marker, Marker oldMarker) throws InterruptedException {
        int idFloor = 0;

        moveFromUp(floorArray[idFloor], marker, oldMarker);

        while (idFloor <= 3) {
            switch (direction) {
                case UP -> moveFromUp(floorArray[idFloor], marker, oldMarker);
                case DOWN -> moveFromDown(floorArray[idFloor], marker, oldMarker);
                case RIGHT -> moveFromRight(floorArray[idFloor], marker, oldMarker);
                case LEFT -> moveFromLeft(floorArray[idFloor], marker, oldMarker);
            }

            if (floorArray[idFloor].getFloorEndFlag() == 0) {
                idFloor++;

                System.out.println();

                if (idFloor == 4) {
                    System.out.println("-----------YOU FOUND AN EXIT--------------");
                    break;
                }

                System.out.println("-----------FLOOR" + " " + (idFloor + 1) + "-------------");
            }
        }
    }

    public void moveFromUp(Floor floor, Marker marker, Marker oldMarker) throws InterruptedException {
        if (floor.getField()[marker.getI()][marker.getJ() - 1] != 1){
            setOldMarker(marker, oldMarker);

            marker.setJ(marker.getJ() - 1);

            checkEndFloor(floor, marker);

            direction = Directions.RIGHT;

            printNewLabyrinth(floor, marker, oldMarker);
            Thread.sleep(1500);
        } else if (floor.getField()[marker.getI() + 1][marker.getJ()] != 1){
            setOldMarker(marker, oldMarker);

            marker.setI(marker.getI() + 1);

            checkEndFloor(floor, marker);

            direction = Directions.UP;

            printNewLabyrinth(floor, marker, oldMarker);
            Thread.sleep(1500);
        } else if (floor.getField()[marker.getI()][marker.getJ() + 1] != 1) {
            setOldMarker(marker, oldMarker);

            marker.setJ(marker.getJ() + 1);

            checkEndFloor(floor, marker);

            direction = Directions.LEFT;

            printNewLabyrinth(floor, marker, oldMarker);
            Thread.sleep(1500);
        } else if (floor.getField()[marker.getI() - 1][marker.getJ()] != 1){
            setOldMarker(marker, oldMarker);

            marker.setI(marker.getI() - 1);

            checkEndFloor(floor, marker);

            direction = Directions.DOWN;

            printNewLabyrinth(floor, marker, oldMarker);
            Thread.sleep(1500);
        }
    }

    public void moveFromDown(Floor floor, Marker marker, Marker oldMarker) throws InterruptedException {
        if (floor.getField()[marker.getI()][marker.getJ() + 1] != 1) {
            setOldMarker(marker, oldMarker);

            marker.setJ(marker.getJ() + 1);

            direction = Directions.LEFT;

            checkEndFloor(floor, marker);

            printNewLabyrinth(floor, marker, oldMarker);
            Thread.sleep(1500);
        } else if (floor.getField()[marker.getI() - 1][marker.getJ()] != 1){
            setOldMarker(marker, oldMarker);

            marker.setI(marker.getI() - 1);

            direction = Directions.DOWN;

            checkEndFloor(floor, marker);

            printNewLabyrinth(floor, marker, oldMarker);
            Thread.sleep(1500);
        } else if (floor.getField()[marker.getI()][marker.getJ() - 1] != 1) {
            setOldMarker(marker, oldMarker);

            marker.setJ(marker.getJ() - 1);

            direction = Directions.RIGHT;

            checkEndFloor(floor, marker);

            printNewLabyrinth(floor, marker, oldMarker);
            Thread.sleep(1500);
        } else if (floor.getField()[marker.getI() + 1][marker.getJ()] != 1) {
            setOldMarker(marker, oldMarker);

            marker.setI(marker.getI() + 1);

            direction = Directions.UP;

            checkEndFloor(floor, marker);

            printNewLabyrinth(floor, marker, oldMarker);
            Thread.sleep(1500);
        }
    }

    public void moveFromRight(Floor floor, Marker marker, Marker oldMarker) throws InterruptedException {
        if (floor.getField()[marker.getI() - 1][marker.getJ()] != 1) {
            setOldMarker(marker, oldMarker);

            marker.setI(marker.getI() - 1);

            direction = Directions.DOWN;

            checkEndFloor(floor, marker);

            printNewLabyrinth(floor, marker, oldMarker);
            Thread.sleep(1500);
        } else if (floor.getField()[marker.getI()][marker.getJ() - 1] != 1) {
            setOldMarker(marker, oldMarker);

            marker.setJ(marker.getJ() - 1);

            direction = Directions.RIGHT;

            checkEndFloor(floor, marker);

            printNewLabyrinth(floor, marker, oldMarker);
            Thread.sleep(1500);
        } else if (floor.getField()[marker.getI() - 1][marker.getJ()] !=1 ) {
            setOldMarker(marker, oldMarker);

            marker.setI(marker.getI() - 1);

            direction = Directions.UP;

            checkEndFloor(floor, marker);

            printNewLabyrinth(floor, marker, oldMarker);
            Thread.sleep(1500);
        } else if (floor.getField()[marker.getI()][oldMarker.getJ() + 1] != 1) {
            setOldMarker(marker, oldMarker);

            marker.setJ(marker.getJ() + 1);

            direction = Directions.LEFT;

            checkEndFloor(floor, marker);

            printNewLabyrinth(floor, marker, oldMarker);
            Thread.sleep(1500);
        }
    }

    public void moveFromLeft(Floor floor, Marker marker, Marker oldMarker) throws InterruptedException {
        if (floor.getField()[marker.getI() + 1][marker.getJ()] != 1) {
            setOldMarker(marker, oldMarker);

            marker.setI(marker.getI() + 1);

            direction = Directions.UP;

            checkEndFloor(floor, marker);

            printNewLabyrinth(floor, marker, oldMarker);
            Thread.sleep(1500);
        } else if (floor.getField()[marker.getI()][marker.getJ() + 1] != 1) {
            setOldMarker(marker, oldMarker);

            marker.setJ(marker.getJ() + 1);

            direction = Directions.LEFT;

            checkEndFloor(floor, marker);

            printNewLabyrinth(floor, marker, oldMarker);
            Thread.sleep(1500);
        } else if (floor.getField()[marker.getI() - 1][marker.getJ()] != 1) {
            setOldMarker(marker, oldMarker);

            marker.setI(marker.getI() - 1);

            direction = Directions.DOWN;

            checkEndFloor(floor, marker);

            printNewLabyrinth(floor, marker, oldMarker);
            Thread.sleep(1500);
        } else if (floor.getField()[marker.getI()][marker.getJ() - 1] != 1){
            setOldMarker(marker, oldMarker);

            marker.setJ(marker.getJ() - 1);

            direction = Directions.RIGHT;

            checkEndFloor(floor, marker);

            printNewLabyrinth(floor, marker, oldMarker);
            Thread.sleep(1500);
        }
    }

    public void setOldMarker(Marker marker, Marker oldMarker) {
        oldMarker.setI(marker.getI());
        oldMarker.setJ(marker.getJ());
    }

    public void checkEndFloor(Floor floor, Marker marker) {
        if (floor.getField()[marker.getI()][marker.getJ()] == 9) {
            floor.setFloorEndFlag(0);
        }
    }

    public void printNewLabyrinth(Floor floor, Marker marker, Marker oldMarker) {
        floor.getField()[oldMarker.getI()][oldMarker.getJ()] = 0;
        floor.getField()[marker.getI()][marker.getJ()] = 3;

        System.out.println();

        for (int i = 0; i < floor.getField().length; i++) {
            for (int j = 0; j < floor.getField()[i].length; j++) {
                System.out.print (floor.getField()[i][j] + " ");
            }
            System.out.println();
        }
    }
}
