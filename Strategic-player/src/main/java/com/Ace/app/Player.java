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
            if(revealsPerSpin > 0) {
                ((StringBuilder) coinState).append("?");
                revealsPerSpin--;

            }
            else {
                ((StringBuilder) coinState).append("-");
            }


        }

            return coinState;
    }

    @Override
    public CharSequence getNewCoinStates(CharSequence revealedPattern) {
        CharSequence newCharSequence = new StringBuilder();
        System.out.println(revealedPattern);

        for (int i = 0; i < 4; i ++){
            if(revealedPattern.charAt(i) == '?'){
                ((StringBuilder) newCharSequence).append('H');
            }
            else {
                ((StringBuilder) newCharSequence).append('-');

            }
        }
        System.out.println(newCharSequence);

        return null;
    }
}
