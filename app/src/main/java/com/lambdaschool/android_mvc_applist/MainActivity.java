package com.lambdaschool.android_mvc_applist;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import static com.lambdaschool.android_mvc_applist.AppListingDetails.EXTRA_NAME;
import static com.lambdaschool.android_mvc_applist.AppRepository.getAppListings;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<AppListing> mockDataReady = getAppListings();

        LinearLayout linearLayout = findViewById(R.id.linear_layout_list);

        for (final AppListing companyData : mockDataReady) {
            TextView addTextView = new TextView(this);

            addTextView.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            addTextView.setText(companyData.getAppName());
            addTextView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            addTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), AppListingDetails.class);
                    intent.putExtra(EXTRA_NAME, companyData);
                    startActivity(intent);
                }
            });

            linearLayout.addView(addTextView);
        }
    }
}
