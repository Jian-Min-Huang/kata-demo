package com.example.kata.lab;

import java.util.HashMap;

import static java.lang.Math.abs;

public class Tennis {
    private final String firstPlayerName;
    private final String secondPlayerName;
    private int firstPlayerScore;
    private int secondPlayerScore;

    public Tennis(String firstPlayerName, String secondPlayerName) {
        this.firstPlayerName = firstPlayerName;
        this.secondPlayerName = secondPlayerName;
    }

    public String score() {
        HashMap<Integer, String> scoreLookup = new HashMap<>() {{
            put(0, "Love");
            put(1, "Fifteen");
            put(2, "Thirty");
            put(3, "Forty");
        }};
        if (firstPlayerScore != secondPlayerScore) {
            if (alreadyAdv()) {
                if (isAdv()) {
                    return getAdv() + " Adv";
                }
                return getAdv() + " Win";
            }
            return String.format("%s %s", scoreLookup.get(firstPlayerScore), scoreLookup.get(secondPlayerScore));
        }
        if (firstPlayerScore >= 3) {
            return "Deuce";
        }
        return String.format("%s All", scoreLookup.get(firstPlayerScore));
    }

    private boolean alreadyAdv() {
        return firstPlayerScore > 3 || secondPlayerScore > 3;
    }

    private boolean isAdv() {
        return abs(firstPlayerScore - secondPlayerScore) == 1;
    }

    private String getAdv() {
        return firstPlayerScore > secondPlayerScore
                ? firstPlayerName
                : secondPlayerName;
    }

    public void firstPlayerScore() {
        firstPlayerScore++;
    }

    public void secondPlayerScore() {
        secondPlayerScore++;
    }
}
