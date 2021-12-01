package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class Simulation {

    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player;
    private Long numberToGuess;

    public Simulation(Player player) {
        this.player=player;
    }

    public void initialize(long numberToGuess) {

    }

    /**
     * @return true if the player have guessed the right number
     */
    private boolean nextRound() {
        System.out.println("Devinez le nombre: ");
        long guess = player.askNextGuess();
        if (guess == numberToGuess)
            return true;
        if (guess > numberToGuess) {
            logger.log("c'est moins");
            player.respond(false);
        }else{
            logger.log("c'est plus");
            player.respond(true);
        }

        return false;
    }

    public void loopUntilPlayerSucceed() {
        while (!nextRound()) {
            nextRound();
        }
    }
}
