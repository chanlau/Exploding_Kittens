package com.example.exploding_kittens.EK_Game;

import com.example.exploding_kittens.EK_Actions.actionMessage.GameAction;
import com.example.exploding_kittens.EK_Player.GamePlayer;
import com.example.exploding_kittens.EK_Player.Player;

public class EK_LocalGame extends LocalGame {

    @Override
    protected void sendUpdatedStateTo(Player p) {
    }

    @Override
    protected boolean canMove(int playerIdx) {
        return false;
    }

    @Override
    protected String checkIfGameOver() {
        return null;
    }

    @Override
    protected boolean makeMove(GameAction action) {
        return false;
    }

    @Override
    public void start(Player[] players) {

    }
}
