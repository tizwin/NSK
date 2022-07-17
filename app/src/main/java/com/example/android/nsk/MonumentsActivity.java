package com.example.android.nsk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.android.nsk.Fragments.MonumentsFragment;
import com.example.android.nsk.R;

public class MonumentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new MonumentsFragment())
                .commit();
    }
}