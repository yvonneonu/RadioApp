package com.example.radioapp;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import androidx.annotation.Nullable;

import com.google.android.exoplayer2.SimpleExoPlayer;

public class RadioService extends Service {

    SimpleExoPlayer simpleExoPlayer;


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


}
