package com.lambdaschool.android_mvc_applist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static com.lambdaschool.android_mvc_applist.AppRepository.getAppListings;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getAppListings();
    }
}
