package com.mundeeppurewal.GameBoard;

public class GameBoard {

    private String gameboard[][] = new String[10][10];

    public GameBoard() {
        //initialize game board
        for (int x = 0; x <= gameboard.length - 1; x++) {
            for (int y = 0; y <= gameboard.length - 1; y++) {
                gameboard[y][x] = "-";
            }
        }
        gameboard[5][5] = "O";
        gameboard[5][4] = "O";
        gameboard[4][4] = "O";
    }


    public void printGameBoard() {
        //initialize game board
//        System.out.
        for (int y = 0; y < gameboard.length; y++) {
            for (int x = 0; x < gameboard.length; x++) {
                if (x == gameboard.length - 1) {
                    System.out.print(gameboard[y][y] + "\n");
                } else {
                    System.out.print(gameboard[y][x]);
                }
            }
        }
    }

    public void runGame() {
        boolean isRunning = true;

        while (true) {
            int livingBeings = 0;
            //initialize game board
            for (int y = 0; y < gameboard.length - 1; y++) {
                for (int x = 0; x < gameboard.length - 1; x++) {
                    updateBeingsState(gameboard, y, x);
                }
            }
            System.out.println("It's Over Man!!!! Game Over!!!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }


    public void updateBeingsState(String gameBoard[][], int y, int x) {
        int numberOfNeighbours = findNumberOfNeighbours(gameboard, y, x);
        // Check rules
        // Any live cell with fewer than two live neighbors dies, as if caused by under population.
        if (numberOfNeighbours < 2) {
            gameBoard[y][x] = "-";
        }
        // Any live cell with two or three live neighbors lives on to the next generation.
        if (numberOfNeighbours >= 2) {
            gameBoard[y][x] = "O";
        }
        // Any live cell with more than three live neighbors dies, as if by overpopulation.
        if (numberOfNeighbours > 3) {
            gameBoard[y][x] = "-";
        }
        // Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
        if (numberOfNeighbours == 3) {
            gameBoard[y][x] = "O";
        }
        printGameBoard();
    }

    public int findNumberOfNeighbours(String gameBoard[][], int y, int x) {
        int numberOfNeighbours = 0;

        if (x >= 0 && y >= 0 && x < gameboard.length && y < gameBoard.length) {
            if (x - 1 > 0 && y - 1 > 0) {
                if (gameBoard[y][x - 1] == "O") {
                    numberOfNeighbours++;
                }
                if (gameBoard[y][x + 1] == "O") {
                    numberOfNeighbours++;
                }
                if (gameBoard[y - 1][x] == "O") {
                    numberOfNeighbours++;
                }
                if (gameBoard[y + 1][x] == "O") {
                    numberOfNeighbours++;
                }
            }
        }
        return numberOfNeighbours;
    }
}
