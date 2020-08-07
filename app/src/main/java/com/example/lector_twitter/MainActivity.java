package com.example.lector_twitter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends ListActivity {

    final static String twitterScreenName = "BBCNews";
    final static String TAG = "MainActivity";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

            new TwitterAsyncTask().execute(twitterScreenName,this);
        }
    }

