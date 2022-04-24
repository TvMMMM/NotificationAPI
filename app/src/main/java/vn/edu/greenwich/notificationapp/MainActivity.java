package vn.edu.greenwich.notificationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btVibrate;
    Vibrator vibrator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //vibrate
        btVibrate = findViewById(R.id.bt_vibrate);
        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        btVibrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate( 80);
            }
        });

        //ring
        final MediaPlayer catSoundMP = MediaPlayer.create(this, R.raw.kitten_meow);
        Button playCatSound = (Button) this.findViewById(R.id.bt_ring);
        playCatSound.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                catSoundMP.start();
            }
        });
    }
}