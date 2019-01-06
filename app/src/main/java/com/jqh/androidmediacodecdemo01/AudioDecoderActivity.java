package com.jqh.androidmediacodecdemo01;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;

public class AudioDecoderActivity extends Activity {
    protected static AudioDecoderThread mAudioDecoder;
    private static final String SAMPLE = Environment.getExternalStorageDirectory() + "/video.mp4";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_decoder);

        mAudioDecoder = new AudioDecoderThread();

    }

    @Override
    protected void onStop() {
        super.onStop();
        mAudioDecoder.stop();
    }

    public void onPlay(View view){
        mAudioDecoder.startPlay(SAMPLE);
    }
}
