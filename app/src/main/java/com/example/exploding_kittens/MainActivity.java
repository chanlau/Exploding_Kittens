package com.example.exploding_kittens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.SurfaceView;

public class MainActivity extends AppCompatActivity {

    SurfaceView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //cardView = (SurfaceView) findViewById(R.id.surfaceview);
    }
}