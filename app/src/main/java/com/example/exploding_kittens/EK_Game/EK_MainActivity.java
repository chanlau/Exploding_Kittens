package com.example.exploding_kittens.EK_Game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.exploding_kittens.EK_Game.gameConfiguration.GameConfig;
import com.example.exploding_kittens.EK_Game.GameMainActivity;
import com.example.exploding_kittens.R;

public class EK_MainActivity extends GameMainActivity {

    //SurfaceView cardView;

    @Override
    public GameConfig createDefaultConfig() {
        return null;
    }

    @Override
    public LocalGame createLocalGame() {
        return null;
    }

    /*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //cardView = (SurfaceView) findViewById(R.id.surfaceview);
    }

    */
}