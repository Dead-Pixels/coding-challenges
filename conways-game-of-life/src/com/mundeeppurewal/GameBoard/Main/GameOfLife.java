package com.mundeeppurewal.GameBoard.Main;

public class GameOfLife {

    private String gameBoard[][];

    public GameOfLife(){
    }

    public GameOfLife(String gameboard[][]){
        this.gameBoard = gameboard;
    }

    public void updatePopulationState() {
        //Rules

    }

    public void findNeighbours() {

    }

    @SuppressWarnings("All")
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
