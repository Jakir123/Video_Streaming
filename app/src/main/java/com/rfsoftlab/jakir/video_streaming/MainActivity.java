package com.rfsoftlab.jakir.video_streaming;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnMediaPlayer;
    private Button btnVideoView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializations();
        eventClickListener();


    }

    private void eventClickListener() {
        btnVideoView.setOnClickListener(this);
        btnMediaPlayer.setOnClickListener(this);
    }

    private void initializations() {
        btnMediaPlayer= (Button) findViewById(R.id.btnMediaPlayer);
        btnVideoView= (Button) findViewById(R.id.btnVideoView);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnMediaPlayer:
                Intent startMediaPlayerActivity=new Intent(MainActivity.this,UsingMediaPlayer.class);
                startMediaPlayerActivity.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(startMediaPlayerActivity);
                break;
            case R.id.btnVideoView:
                Intent startVideoViewActivity=new Intent(MainActivity.this,UsingVideoView.class);
                startVideoViewActivity.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(startVideoViewActivity);
                break;

        }

    }
}
