package com.roman.AISD_LAB1;

import com.roman.AISD_LAB1.entity.Floor;
import com.roman.AISD_LAB1.entity.Marker;
import com.roman.AISD_LAB1.service.LabyrinthService;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Marker marker = new Marker(1, 1);
        Marker oldMarker = new Marker(1,1);

        Floor floor1 = new Floor(1, new int[][]{{1,1,1,1,1,1,1,1,1,1},//0
                                                       {1,0,1,0,0,0,0,0,0,1},//1
                                                       {1,0,1,0,1,0,1,1,0,1},//2
                                                       {1,0,1,0,1,0,1,9,0,1},//3
                                                       {1,0,1,0,1,1,1,1,1,1},//4
                                                       {1,0,0,0,1,1,1,1,1,1},//5
                                                       {1,1,1,1,1,1,1,1,1,1}}, marker, oldMarker);
                                                     // 0 1 2 3 4 5 6 7 8 9


        Floor floor2 = new Floor(1, new int[][]{{1,1,1,1,1,1,1,1,1,1},//0
                                                       {1,1,1,0,1,1,1,1,1,1},//1
                                                       {1,1,1,0,1,1,1,1,1,1},//2
                                                       {1,1,1,0,0,0,0,0,1,1},//3
                                                       {1,1,1,0,1,1,1,1,1,1},//4
                                                       {1,0,0,0,0,0,0,0,9,1},//5
                                                       {1,1,1,1,1,1,1,1,1,1}}, marker, oldMarker);
                                                     // 0 1 2 3 4 5 6 7 8 9

        Floor floor3 = new Floor(1, new int[][]{{1,1,1,1,1,1,1,1,1,1},//0
                                                       {1,1,1,1,1,0,0,0,1,1},//1
                                                       {1,1,9,1,1,1,1,0,1,1},//2
                                                       {1,1,0,1,1,0,0,0,1,1},//3
                                                       {1,1,0,1,1,1,1,0,1,1},//4
                                                       {1,0,0,0,0,0,0,0,0,1},//5
                                                       {1,1,1,1,1,1,1,1,1,1}}, marker, oldMarker);
                                                     // 0 1 2 3 4 5 6 7 8 9

        Floor floor4 = new Floor(1, new int[][]{{1,1,1,1,1,1,1,1,1,1},//0
                                                       {1,1,0,0,0,0,0,0,1,1},//1
                                                       {1,1,0,1,1,1,1,0,0,1},//2
                                                       {1,1,1,1,9,0,1,1,0,1},//3
                                                       {1,1,1,1,1,0,0,0,0,1},//4
                                                       {1,1,1,1,1,1,1,1,1,1},//5
                                                       {1,1,1,1,1,1,1,1,1,1}}, marker, oldMarker);
                                                     // 0 1 2 3 4 5 6 7 8 9


        Floor[] floorArray = {floor1, floor2, floor3, floor4};

        LabyrinthService labyrinthService = new LabyrinthService();

        labyrinthService.up(floor1, marker);

        int idFloor = 0;

        while (idFloor <= 3) {
            switch (labyrinthService.direction) {
                case UP -> labyrinthService.up(floorArray[idFloor], marker);
                case DOWN -> labyrinthService.down(floorArray[idFloor]);
                case RIGHT -> labyrinthService.right(floorArray[idFloor]);
                case LEFT -> labyrinthService.left(floorArray[idFloor]);
            }

            if (floorArray[idFloor].getNumber() == 0) {
                idFloor++;

                System.out.println();
                System.out.println("-----------FLOOR" + " " + (idFloor + 1) + "-------------");
            }
        }
    }
}
