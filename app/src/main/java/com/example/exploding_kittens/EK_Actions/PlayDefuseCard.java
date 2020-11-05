package com.example.exploding_kittens.EK_Actions;

import com.example.exploding_kittens.EK_Actions.actionMessage.GameAction;
import com.example.exploding_kittens.EK_Player.Player;

public class PlayDefuseCard extends GameAction {
    /**
     * constructor for GameAction
     *
     * @param player the player who created the action
     */
    public PlayDefuseCard(Player player) {
        super(player);
    }
}
