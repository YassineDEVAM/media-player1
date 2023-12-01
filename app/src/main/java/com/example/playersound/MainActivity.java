package com.example.playersound;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //Create objects

    Button b1,b2,b3;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //fetch Reference from xml file
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);

        // Specify the Music file

        mp = MediaPlayer.create(getApplicationContext(),R.raw.hindi);

        // Play MUSIC FILE
         b1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 mp.start();//Play Music

                  }
                    });
         b2.setOnClickListener( new View.OnClickListener(){

                                    @Override
                                    public void onClick(View view) {
                                        mp.pause();
                                    }
                                }
         );
         b3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 mp.stop();
             }
         });
    }
}