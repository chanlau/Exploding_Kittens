package com.example.exploding_kittens.EK_Player;

import com.example.exploding_kittens.EK_Game.GameMainActivity;
import com.example.exploding_kittens.EK_Game.infoMessage.GameInfo;

public class ExplodingKittensComputerPlayer extends GameComputerPlayer {

    public ExplodingKittensComputerPlayer(int num, String name) {
        super(name);
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

    @Override
    public void gameSetAsGui(GameMainActivity activity) {

    }
}
