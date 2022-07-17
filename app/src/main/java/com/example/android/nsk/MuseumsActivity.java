package com.example.android.nsk;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.android.nsk.Fragments.MuseumsFragment;

public class MuseumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new MuseumsFragment())
                .commit();
    }
}
