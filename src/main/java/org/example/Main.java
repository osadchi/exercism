package org.example;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        StateOfTicTacToeTest test = new StateOfTicTacToeTest();
        test.setup();
        test.testFinishedGameWhereXWonViaLeftColumnVictory();
        test.testFinishedGameWhereXWonViaMiddleColumnVictory();
        test.testFinishedGameWhereXWonViaRightColumnVictory();
        test.testFinishedGameWhereOWonViaLeftColumnVictory();
        test.testFinishedGameWhereOWonViaMiddleColumnVictory();
        test.testFinishedGameWhereOWonViaRightColumnVictory();
        test.testFinishedGameWhereXWonViaTopRowVictory();
        test.testFinishedGameWhereXWonViaMiddleRowVictory();
        test.testFinishedGameWhereXWonViaBottomRowVictory();
        test.testFinishedGameWhereOWonViaTopRowVictory();
        test.testFinishedGameWhereOWonViaMiddleRowVictory();
        test.testFinishedGameWhereOWonViaBottomRowVictory();
        test.testFinishedGameWhereXWonViaFallingDiagonalVictory();
        test.testFinishedGameWhereXWonViaRisingDiagonalVictory();
        test.testFinishedGameWhereOWonViaFallingDiagonalVictory();
        test.testFinishedGameWhereOWonViaRisingDiagonalVictory();
        test.testFinishedGameWhereXWonViaARowAndAColumnVictory();
        test.testFinishedGameWhereXWonViaTwoDiagonalVictories();
        test.testDraw();
        test.testAnotherDraw();
        test.testOngoingGameOneMoveIn();
        test.testOngoingGameTwoMovesIn();
        test.testOngoingGameFiveMovesIn();
        test.testInvalidBoardXWentTwice();
        test.testInvalidBoardOStarted();
        test.testInvalidBoard();
        test.testInvalidBoardPlayersKeptPlayingAfterAWin();

    }
}