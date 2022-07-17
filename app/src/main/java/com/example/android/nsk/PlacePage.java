package com.example.android.nsk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.android.nsk.R;

public class PlacePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_page);

        ScrollView scrollView = findViewById(R.id.placePageBg);
        ImageView imageView = findViewById(R.id.placePageImage);
        TextView placeTitle = findViewById(R.id.placePageTitle);
        TextView placeContent = findViewById(R.id.placePageContent);

        scrollView.setBackgroundColor(getIntent().getIntExtra("cardView", 0));
        imageView.setImageResource(getIntent().getIntExtra("imageView", 0));
        placeTitle.setText(getIntent().getStringExtra("textView"));
        placeContent.setText(getIntent().getStringExtra("textContent"));
    }
}