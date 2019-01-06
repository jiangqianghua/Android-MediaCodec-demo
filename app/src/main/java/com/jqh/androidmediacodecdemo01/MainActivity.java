package com.jqh.androidmediacodecdemo01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onPlayMp4(View view){
        Intent intent = new Intent(this,DecodeMp4Activity.class);
        startActivity(intent);
    }

    public void onPlaAAC(View view){
        Intent intent = new Intent(this,AudioDecoderActivity.class);
        startActivity(intent);
    }

    public void onPlaH264(View view){
        Intent intent = new Intent(this,VideoDecoderActivity.class);
        startActivity(intent);
    }
}
