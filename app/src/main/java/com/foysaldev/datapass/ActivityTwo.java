package com.foysaldev.datapass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class ActivityTwo extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        imageView = findViewById(R.id.ImageViewTwo);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int image = bundle.getInt("google_img");
            imageView.setImageResource(image);
        }
    }
}