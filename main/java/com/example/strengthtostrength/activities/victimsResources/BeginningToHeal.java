package com.example.strengthtostrength.activities.victimsResources;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.strengthtostrength.R;

public class BeginningToHeal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setupToolbar();
        setContentView(R.layout.activity_beginning_to_heal);
    }
//    private void setupToolbar() {
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        if (getSupportActionBar() !=null)
//            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//    }
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        if (item.getItemId() == android.R.id.home) {
//            onBackPressed();
//            return true;
//        } else
//            return super.onOptionsItemSelected(item);
//    }

}