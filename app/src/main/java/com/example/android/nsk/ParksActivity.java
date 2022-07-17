package com.example.android.nsk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.android.nsk.Fragments.ParksFragment;
import com.example.android.nsk.R;

public class ParksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new ParksFragment())
                .commit();
    }
}