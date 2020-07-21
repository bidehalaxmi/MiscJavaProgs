package com.personal.java.loop;

public class DrawPlayingBoard {
    public static void main(String[] args) {
        int row = 50;
        int col = 30;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("|_");
            }
            System.out.print("|");
            System.out.println();
        }
    }
}
