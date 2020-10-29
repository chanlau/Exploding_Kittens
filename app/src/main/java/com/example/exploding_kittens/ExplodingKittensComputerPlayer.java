package com.example.exploding_kittens;

public class ExplodingKittensComputerPlayer extends Player {

    public ExplodingKittensComputerPlayer(int num, String name) {
        super(num, name);
    }

    /**
     * Receives information (hopefully the gamestate) and decides the best
     * actions from there
     * @param info
     *     information, presumably the gamestate
     */
    @Override
    protected void receiveInfo(GameInfo info) {

    }

    /**
     * Update the display with actions that the computer player is taking.
     * Do this so that the human player can follow along and understand what
     * the computer players are doing
     */
    public void updateDisplay() {

    }

    @Override
    public void setAsGui(GameMainActivity a) {

    }

}
