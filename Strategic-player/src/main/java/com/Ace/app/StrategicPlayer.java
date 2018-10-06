package com.Ace.app;

/**
 * A player of the Spin-the-Wheel Coin Matching Game.
 *
 * @author Dr. Jody Paul
 * @version 1.1.0 (20181004)
 */
public interface StrategicPlayer {
    /**
     * Establishes that the player is beginning a new game.
     * @param coinsPerWheel the number of coins in the wheel
     * @param revealsPerSpin the number of coins revealed per turn/spin
     * @param maxNumSpins the maximum number of spin allowed for the game
     */
    void beginGame(int coinsPerWheel, int revealsPerSpin, int maxNumSpins);

    /**
     * Provides the request pattern for the current turn.
     * The returned pattern is a copy of the parameter
     * in which a '?' replaces '-' in exactly the number
     * of places as the permitted reveals-per-spin.
     * @param blankPattern a proper-length pattern consisting of all '-'
     * @return a proper reveal-pattern consisting of '-' and '?'
     */
    CharSequence getSlotsToReveal(CharSequence blankPattern);

    /**
     * Provides the coin-state set pattern for the current turn.
     * The returned pattern is a copy of the parameter
     * in which all '-' are preserved and each location of
     * 'H' and 'T' may be replaced by either 'H' or 'T'.
     * @param revealedPattern a proper-length pattern
     *                        consisting of '-', 'H', and 'T'
     * @return a proper set-pattern consisting of '-', 'H', and 'T'
     */
    CharSequence getNewCoinStates(CharSequence revealedPattern);
}