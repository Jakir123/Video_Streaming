package com.rfsoftlab.jakir.video_streaming;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class UsingVideoView extends AppCompatActivity {
    private VideoView vidView;
    private Uri vidUri;
    private MediaController vidControl;
    private String vidAddress = "https://archive.org/download/ksnn_compilation_master_the_internet/ksnn_compilation_master_the_internet_512kb.mp4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_using_video_view);

        initializations();

    }

    private void initializations() {
        vidView = (VideoView) findViewById(R.id.myVideo);


        vidUri = Uri.parse(vidAddress);

        vidView.setVideoURI(vidUri);
        vidView.start();

        vidControl = new MediaController(this);
        vidControl.setAnchorView(vidView);

        vidView.setMediaController(vidControl);
    }

}
