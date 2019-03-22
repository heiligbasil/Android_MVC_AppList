package com.lambdaschool.android_mvc_applist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AppListingDetails extends AppCompatActivity {

    public static final String EXTRA_NAME = "data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_listing_details);

        Intent intent = getIntent();
        AppListing mockDataToShow = (AppListing)intent.getSerializableExtra(EXTRA_NAME);

        ((TextView)findViewById(R.id.text_view_id)).append(String.valueOf(mockDataToShow.getId()));
        ((TextView)findViewById(R.id.text_view_app_name)).append(mockDataToShow.getAppName());
        ((TextView)findViewById(R.id.text_view_app_version)).append(mockDataToShow.getAppVersion());
        ((TextView)findViewById(R.id.text_view_domain_name)).append(mockDataToShow.getDomainName());
        ((TextView)findViewById(R.id.text_view_contact_email)).append(mockDataToShow.getContactEmail());
        ((TextView)findViewById(R.id.text_view_image_url)).append(mockDataToShow.getImageUrl());
    }
}
