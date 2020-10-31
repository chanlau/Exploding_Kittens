/**
 * Date: 10/20/2020
 * Authors: Chandler Lau, Ka'ulu Ng, Samuel Warrick
 * Version: Project #d Final
 */

package com.example.exploding_kittens.EK_Actions;

import com.example.exploding_kittens.EK_Player.Player;
import com.example.exploding_kittens.actions.CardAction;

public class PlayFavorCard extends CardAction {
    private Player target;
    private int choice;

    public PlayFavorCard(Player p, Player t, int c){
        super(p);
        this.target = t;
        this.choice = c;
    }

    public Player getTarget(){
        return this.target;
    }
    public int getChoice() {return this.choice;}
}
