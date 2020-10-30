package com.example.exploding_kittens.E_Kittens.EK_Game;

import com.example.exploding_kittens.GameFramework.GamePlayer;
import com.example.exploding_kittens.GameFramework.LocalGame;

public class EK_LocalGame extends LocalGame {
    @Override
    protected void sendUpdatedStateTo(GamePlayer p) {

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
    protected boolean makeMove(CardAction action) {
        return false;
    }
}
