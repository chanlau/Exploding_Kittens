package com.example.exploding_kittens;

import android.view.View;

import java.util.ArrayList;

public class ExplodingKittensHumanPlayer extends Player {

    /**
     * constructor
     * @param num
     * @param name
     *      number corresponding to this player
     *      name corresponding to  this player
     */
    public ExplodingKittensHumanPlayer(int num, String name) {
        super(num, name);
    }


    public View getTopView() {

    }

    /**
     * Receives information (hopefully the gamestate) and decides the best
     * actions from there
     * @param info
     *     information, presumably the gamestate
     */
    protected void receiveInfo(GameInfo info) {

    }

    /**
     * Updates the GUI with new information after actions are taken
     */
    public void updateDisplay() {

    }

    public void onClick() {

    }

    public void setAsGui(GameActivity activity) {

    }

}
