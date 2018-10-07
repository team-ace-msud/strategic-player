package com.Ace.app;
import java.util.Random;

/**
 *
 *
 */

public class Coin {
    private char coinState;

    /**
     * Constructs a Coin object with a randomized value of 'H' or 'T'.
     */
    public Coin() {
        char[] coinChoose = {'H', 'T'}; // Coin options: H for heads, T for tails
        Random random = new Random();

        this.coinState = coinChoose[random.nextInt(coinChoose.length)]; // Randomly selects 0 or 1 from coinChoose and assigns value to coinState
    }

    /**
     * Modifies the coin state by flipping the value
     */
    public void flip() {
        if(coinState == 'H') {
            coinState = 'T';
        }
        else {
            coinState = 'H';
        }
    }

    /**
     * Provides the current state of the coin
     *
     * @return Current Coin State
     */
    public char get_coin() {
        return coinState;
    }

    /**
     * Sets the state of the coin to a new state provided by the engine
     * @param newState	new state of the coin as input by the engine
     */
    public void set_coin(char newState) {
        if(newState == 'H' || newState == 'T')
            coinState = newState;
        else
            System.out.println("Invalid coin value");
    }
}