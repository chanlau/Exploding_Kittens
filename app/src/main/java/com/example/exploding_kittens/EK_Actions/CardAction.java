package com.example.exploding_kittens.EK_Actions;

import com.example.exploding_kittens.EK_Game.GamePlayer;
import com.example.exploding_kittens.EK_Actions.actionMessage.GameAction;

public class CardAction extends GameAction{
    /**
     * constructor for GameAction
     *
     * @param player the player who created the action
     */
    public CardAction(GamePlayer player) {
        super(player);
    }

}