package com.lambdaschool.android_mvc_applist;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

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
        Picasso.get().setLoggingEnabled(true);
        Picasso.get().setIndicatorsEnabled(true);
        Picasso.get()
                .load(mockDataToShow.getImageUrl())
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.error)
                .into((ImageView) findViewById(R.id.image_view_image));
    }
}
