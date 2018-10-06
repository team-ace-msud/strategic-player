package com.Ace.app;

public class Player implements StrategicPlayer {

    CharSequence coinState;
    int coinsPerWheel;
    int revealsPerSpin;



    @Override
    public void beginGame(int coinsPerWheel, int revealsPerSpin, int maxNumSpins) {
        System.out.println("Welcome to the Game.  ");



    }

    @Override
    public CharSequence getSlotsToReveal(CharSequence blankPattern){

    coinState = new StringBuilder();
        for(int i = 0; i < blankPattern.length(); i++) {
        ((StringBuilder) coinState).append(" -");
    }
            return coinState;
    }

    @Override
    public CharSequence getNewCoinStates(CharSequence revealedPattern) {

        return null;
    }
}
