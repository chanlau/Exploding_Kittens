/**
 * Date: 10/20/2020
 * Authors: Chandler Lau, Ka'ulu Ng, Samuel Warrick
 * Version: Project #d Final
 */

package com.example.exploding_kittens.EK_Actions;

import com.example.exploding_kittens.EK_Player.GamePlayer;

public class PlayFavorCard extends CardAction {
    private GamePlayer target;
    private int choice;

    public PlayFavorCard(GamePlayer p, GamePlayer t, int c){
        super(p);
        this.target = t;
        this.choice = c;
    }

    public GamePlayer getTarget(){
        return this.target;
    }
    public int getChoice() {return this.choice;}
}
