/**
 * Date: 10/20/2020
 * Authors: Chandler Lau, Ka'ulu Ng, Samuel Warrick
 * Version: Project #d Final
 */

package com.example.exploding_kittens.EK_Player;

import com.example.exploding_kittens.state.Card;

import java.util.ArrayList;

public class Player {
    //Player class will signify what
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
}