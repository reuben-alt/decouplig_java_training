package fr.lernejo.guessgame;

import java.util.Scanner;

public class HumanPlayer implements Player{
    public long askNextGuess() {
        return new Scanner(System.in).nextLong();
    }

    public void respond(boolean lowerOrGreater) {

    }
}
