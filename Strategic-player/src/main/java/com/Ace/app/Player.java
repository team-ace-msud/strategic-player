package com.Ace.app;

import java.util.Random;

public class Player implements StrategicPlayer {

    private CharSequence coinState;
    private int coinsPerWheel;
    private int revealsPerSpin;
    private int maxNumSpins;


    @Override
    public void beginGame(int coinsPerWheel, int revealsPerSpin, int maxNumSpins) {
        System.out.println("Welcome to the Game.  ");
        this.coinsPerWheel = coinsPerWheel;
        this.revealsPerSpin = revealsPerSpin;
        this.maxNumSpins = maxNumSpins;



    }

    @Override
    public CharSequence getSlotsToReveal(){
    Random random = new Random();
    coinState = new StringBuilder();
        for(int i = 0; i < coinsPerWheel; i++) {
            if(random.nextBoolean() == true) {
                ((StringBuilder) coinState).append(" -");
            }
            else if(revealsPerSpin > 0) {
                ((StringBuilder) coinState).append(" ?");
                revealsPerSpin--;
            }


        }

            return coinState;
    }

    @Override
    public CharSequence getNewCoinStates(CharSequence revealedPattern) {

        return null;
    }
}
