package com.example.exploding_kittens.EK_Actions;

import com.example.exploding_kittens.EK_Player.Player;

public class CardAction {
    private Player player;

    public CardAction(Player p){
        this.player = p;
    }

    public Player getPlayer() {
        return this.player;
    }

}