package com.Ace.app;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Player implements StrategicPlayer {

    private CharSequence coinState;
    private int coinsPerWheel;
    private int revealsPerSpin;
    private int maxNumSpins;
    private Random random = new Random();



    @Override
    public void beginGame(int coinsPerWheel, int revealsPerSpin, int maxNumSpins) {
        //System.out.println("Welcome to the Game.  ");
        this.coinsPerWheel = coinsPerWheel;
        this.revealsPerSpin = revealsPerSpin;
        this.maxNumSpins = maxNumSpins;



    }

    @Override
    public CharSequence getSlotsToReveal(){


            return coinState;
    }

    @Override
    public CharSequence getNewCoinStates(CharSequence revealedPattern) {


        return null;
    }
}
