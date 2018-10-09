package com.Ace.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Player player = new Player();
        player.beginGame(4,2,10);


        player.getNewCoinStates(player.getSlotsToReveal());
        }
}
