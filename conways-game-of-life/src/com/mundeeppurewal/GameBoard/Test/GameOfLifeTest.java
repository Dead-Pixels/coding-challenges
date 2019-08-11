package com.mundeeppurewal.GameBoard.Test;

import com.mundeeppurewal.GameBoard.Main.GameOfLife;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameOfLifeTest {

    private GameOfLife gameOfLife;

    @BeforeEach
    private void setUp() {


    }

    @Test
    public void updatePopulationState_fewerThanTwoNeighbours_allPeopleShouldDie() {
        String gameBoard[][] = {{"-","-","-","-","-","-","-","-"},
                                {"-","-","-","-","-","-","-","-"},
                                {"-","-","-","O","-","-","-","-"},
                                {"-","-","O","O","-","-","-","-"},
                                {"-","-","-","-","-","-","-","-"},
                                {"-","-","-","-","-","-","-","-"},
                                {"-","-","-","-","-","O","-","-"},
                                {"-","-","-","-","-","-","-","-"}
        };

        GameOfLife gameOfLife = new GameOfLife(gameBoard);

        gameOfLife.printGame();

        gameOfLife.updatePopulationState();

        gameOfLife.printGame();



    }

    @Test
    public void findNeighbours() {

    }
}