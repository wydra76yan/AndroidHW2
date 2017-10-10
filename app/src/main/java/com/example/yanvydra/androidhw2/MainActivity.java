package com.example.yanvydra.androidhw2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String Tag = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(Tag, "Cherry pick");
        //try to conflict one more time
        //try to conflict one two more time
        //try to conflict one three time
        
    }
}
