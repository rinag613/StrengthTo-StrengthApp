package com.example.strengthtostrength.activities.victimsResources;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.strengthtostrength.R;
import com.example.strengthtostrength.activities.OrganizationResources;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class VictimsResourcesHome extends AppCompatActivity {

    private Button iSur;
    private Button coping;
    private Button heal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_victims_resources_home);

         iSur =(Button) findViewById(R.id.iSurvived);
        iSur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showISurvived();
            }
        });
         coping = (Button)findViewById(R.id.coping);
        coping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showCoping();
            }
        });
         heal = (Button)findViewById(R.id.healing);
        heal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showHealing();
            }
        });
    }

    private void showISurvived() {
        Intent intent = new Intent(this, ISurvived.class);
        startActivity(intent);
    }
    private void showCoping() {
        Intent intent = new Intent(this, CopingAndConnection.class);
        startActivity(intent);
    }
    private void showHealing() {
        Intent intent = new Intent(this, BeginningToHeal.class);
        startActivity(intent);
    }

}