package com.example.kata.lab;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TennisTest {

    Tennis tennis = new Tennis("Amy", "Jay");

    @Test
    void Love_All() {
        scoreShouldBe("Love All");
    }

    @Test
    void Fifteen_Love() {
        givenFirstPlayerScore(1);
        scoreShouldBe("Fifteen Love");
    }

    @Test
    void Thirty_Love() {
        givenFirstPlayerScore(2);
        scoreShouldBe("Thirty Love");
    }

    @Test
    void Forty_Love() {
        givenFirstPlayerScore(3);
        scoreShouldBe("Forty Love");
    }

    @Test
    void Love_Fifteen() {
        givenSecondPlayerScore(1);
        scoreShouldBe("Love Fifteen");
    }

    @Test
    void Love_Thirty() {
        givenSecondPlayerScore(2);
        scoreShouldBe("Love Thirty");
    }

    @Test
    void Love_Forty() {
        givenSecondPlayerScore(3);
        scoreShouldBe("Love Forty");
    }

    @Test
    void Fifteen_All() {
        givenFirstPlayerScore(1);
        givenSecondPlayerScore(1);
        scoreShouldBe("Fifteen All");
    }

    @Test
    void Thirty_All() {
        givenFirstPlayerScore(2);
        givenSecondPlayerScore(2);
        scoreShouldBe("Thirty All");
    }

    @Test
    void Deuce() {
        givenFirstPlayerScore(3);
        givenSecondPlayerScore(3);
        scoreShouldBe("Deuce");
    }

    @Test
    void FirstPlayerAdv() {
        givenFirstPlayerScore(4);
        givenSecondPlayerScore(3);
        scoreShouldBe("Amy Adv");
    }

    @Test
    void FirstPlayerWin() {
        givenFirstPlayerScore(5);
        givenSecondPlayerScore(3);
        scoreShouldBe("Amy Win");
    }

    @Test
    void SecondPlayerAdv() {
        givenFirstPlayerScore(3);
        givenSecondPlayerScore(4);
        scoreShouldBe("Jay Adv");
    }

    @Test
    void SecondPlayerWin() {
        givenFirstPlayerScore(3);
        givenSecondPlayerScore(5);
        scoreShouldBe("Jay Win");
    }


    private void givenSecondPlayerScore(int times) {
        for (int i = 0; i < times; i++) {
            tennis.secondPlayerScore();
        }
    }

    private void givenFirstPlayerScore(int times) {
        for (int i = 0; i < times; i++) {
            tennis.firstPlayerScore();
        }
    }

    private void scoreShouldBe(String expected) {
        Assertions.assertThat(tennis.score()).isEqualTo(expected);
    }
}
