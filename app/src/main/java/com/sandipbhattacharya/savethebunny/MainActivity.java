package com.sandipbhattacharya.savethebunny;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {


    private MediaPlayer mediaPlayer;

    public class SuaAtividade extends AppCompatActivity {
        private MediaPlayer mediaPlayer;
        // ... restante do código
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        mediaPlayer = MediaPlayer.create(this, R.raw.xamuel); // substitua "seuarquivo" pelo nome do seu arquivo de áudio (sem extensão)


    }

    public void startGame(View view) {
        GameView gameView = new GameView(this);
        setContentView(gameView);
        mediaPlayer.start();
    }
}