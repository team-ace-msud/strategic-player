package com.Ace.app;

public class Player implements StrategicPlayer {


    @Override
    public void beginGame(int coinsPerWheel, int revealsPerSpin, int maxNumSpins) {
        System.out.println("Welcome to the Game.  ");
    }

    @Override
    public CharSequence getSlotsToReveal(CharSequence blankPattern)
    {
        return null;
    }

    @Override
    public CharSequence getNewCoinStates(CharSequence revealedPattern) {

        return null;
    }
}
