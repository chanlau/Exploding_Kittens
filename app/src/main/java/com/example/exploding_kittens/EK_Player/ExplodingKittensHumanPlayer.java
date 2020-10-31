package com.example.exploding_kittens.EK_Player;

import android.view.View;

import com.example.exploding_kittens.EK_Game.infoMessage.GameInfo;
import com.example.exploding_kittens.EK_Game.GameMainActivity;

public class ExplodingKittensHumanPlayer extends GameHumanPlayer {

    /*
   //variables that are necessary to be a player


    int playerNum;
    String playerName;
    ArrayList<Card> playerHand;

    public Player(int num, String name){
        this.playerNum = num;
        this.playerName = name;
        this.playerHand = new ArrayList<Card>();
    }

    public boolean checkForExplodingKitten(){
        for(int i = 0; i < this.playerHand.size(); i++){
            if(this.playerHand.get(i).getCardType() == 0){
                return true;
            }
        }
        return false;
    }

    public int getPlayerNum(){
        return this.playerNum;
    }
    public String getPlayerName() {return this.playerName;}
    public ArrayList<Card> getPlayerHand() {return this.playerHand;}

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


    public View getTopView() {
        return null;
    }

    /**
     * Receives information (hopefully the gamestate) and decides the best
     * actions from there
     * @param info
     *     information, presumably the gamestate
     */
    public void receiveInfo(GameInfo info) {

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
