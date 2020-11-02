package com.example.exploding_kittens.EK_Actions;


import com.example.exploding_kittens.EK_Actions.actionMessage.GameAction;
import com.example.exploding_kittens.EK_Player.Player;

public class CardAction extends GameAction{
    /**
     * constructor for GameAction
     *
     * @param player the player who created the action
     */
    public CardAction(Player player) {
        super(player);
    }

}