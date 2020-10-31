package com.example.exploding_kittens.EK_Player;

import android.view.View;

import com.example.exploding_kittens.EK_Game.infoMessage.GameInfo;
import com.example.exploding_kittens.EK_Game.GameMainActivity;

public class ExplodingKittensHumanPlayer extends GameHumanPlayer {

    private GameMainActivity myActivity;

    /*

     */

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

    //This returns the top level surface view
    public View getTopView() {
        return null;
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

    public void setAsGui(GameMainActivity activity) {

    }

}
