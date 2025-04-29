package org.example;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static java.util.Map.entry;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BowlingGameTest test = new BowlingGameTest();
        test.shouldBeAbleToScoreAGameWithAllZeros();
        test.shouldBeAbleToScoreAGameWithNoStrikesOrSpares();
        test.aSpareFollowedByZerosIsWorthTenPoints();
        test.pointsScoredInTheRollAfterASpareAreCountedTwice();
        test.consecutiveSparesEachGetAOneRollBonus();
        test.aSpareInTheLastFrameGetsAOneRollBonusThatIsCountedOnce();
        test.aStrikeEarnsTenPointsInFrameWithASingleRoll();
        test.pointsScoredInTheTwoRollsAfterAStrikeAreCountedTwiceAsABonus();
        test.consecutiveStrikesEachGetTheTwoRollBonus();
        test.aStrikeInTheLastFrameGetsATwoRollBonusThatIsCountedOnce();
        test.rollingASpareWithTheTwoRollBonusDoesNotGetABonusRoll();
        test.strikesWithTheTwoRollBonusDoNotGetBonusRolls();
        test.lastTwoStrikesFollowedByOnlyLastBonusWithNonStrikePoints();
        test.aStrikeWithTheOneRollBonusAfterASpareInTheLastFrameDoesNotGetABonus();
        test.allStrikesIsAPerfectGame();
        test.rollsCanNotScoreNegativePoints();
        test.aRollCanNotScoreMoreThan10Points();
        test.twoRollsInAFrameCanNotScoreMoreThan10Points();
        test.bonusRollAfterAStrikeInTheLastFrameCanNotScoreMoreThan10Points();
        test.twoBonusRollsAfterAStrikeInTheLastFrameCanNotScoreMoreThan10Points();
        test.twoBonusRollsAfterAStrikeInTheLastFrameCanScoreMoreThan10PointsIfOneIsAStrike();
        test.theSecondBonusRollsAfterAStrikeInTheLastFrameCanNotBeAStrikeIfTheFirstOneIsNotAStrike();
        test.secondBonusRollAfterAStrikeInTheLastFrameCanNotScoreMoreThan10Points();
        test.anUnstartedGameCanNotBeScored();
        test.anIncompleteGameCanNotBeScored();
        test.canNotRollIfGameAlreadyHasTenFrames();
        test.bonusRollsForAStrikeInTheLastFrameMustBeRolledBeforeScoreCanBeCalculated();
        test.bothBonusRollsForAStrikeInTheLastFrameMustBeRolledBeforeScoreCanBeCalculated();
        test.bonusRollForASpareInTheLastFrameMustBeRolledBeforeScoreCanBeCalculated();
        test.canNotRollAfterBonusRollForSpare();
        test.canNotRollAfterBonusRollForStrike();




    }
}