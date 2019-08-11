package com.mundeeppurewal.GameBoard.Main;

public class GameOfLife {

    private String gameBoard[][];

    public GameOfLife() {
    }

    public GameOfLife(String gameboard[][]) {
        this.gameBoard = gameboard;
    }

    public void updatePopulationState() {
        for (int y = 0; y < gameBoard.length - 1; y++) {
            for (int x = 0; x < gameBoard.length - 1; x++) {
                // Any live cell with fewer than two live neighbors dies, as if caused by under population.
                if (findNeighbours(gameBoard, y, x) < 2) {
                    gameBoard[y][x] = "-";
                }
                // Any live cell with two or three live neighbors lives on to the next generation.
                else if ((findNeighbours(gameBoard, y, x) == 2) || (findNeighbours(gameBoard, y, x) == 2)) {
                    gameBoard[y][x] = "O";
                }
                // Any live cell with more than three live neighbors dies, as if by overpopulation.
                else if ((findNeighbours(gameBoard, y, x) > 3) && (gameBoard[y][x] == "O")) {
                    gameBoard[y][x] = "-";
                }
                // Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
                else if ((findNeighbours(gameBoard, y, x) > 3) && (gameBoard[y][x] == "-")) {
                    gameBoard[y][x] = "O";
                }
            }
        }
    }

    public int findNeighbours(String gameBoard[][], int y, int x) {

        int numberOfNeighbours = 0;

        int ROW_MAX_LENGTH = gameBoard.length - 1;
        int COLUMN_MAX_LENGTH = gameBoard.length - 1;
        int rightOfCurrentX = x + 1;

        if (rightOfCurrentX <= ROW_MAX_LENGTH && gameBoard[y][rightOfCurrentX] != "-") {
            numberOfNeighbours++;
        }

        int belowOfCurrentY = y + 1;
        if (belowOfCurrentY <= COLUMN_MAX_LENGTH && gameBoard[belowOfCurrentY][x] != "-") {
            numberOfNeighbours++;
        }

        int leftOfCurrentX = x - 1;
        if (leftOfCurrentX >= 0 && gameBoard[leftOfCurrentX][y] != "-") {
            numberOfNeighbours++;
        }

        int aboveOfCurrentY = y - 1;
        if (aboveOfCurrentY >= 0 && gameBoard[aboveOfCurrentY][x] != "-") {
            numberOfNeighbours++;
        }

        return numberOfNeighbours;
    }


    public void printGame() {
        //initialize game board
        for (int y = 0; y < gameBoard.length; y++) {
            for (int x = 0; x < gameBoard.length; x++) {
                if (x == gameBoard.length - 1) {
                    System.out.print(gameBoard[y][y] + "\n");
                } else {
                    System.out.print(gameBoard[y][x]);
                }
            }
        }
    }

}
