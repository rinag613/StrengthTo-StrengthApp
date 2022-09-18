package com.example.strengthtostrength.activities;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.strengthtostrength.R;
import com.example.strengthtostrength.activities.victimsResources.VictimsResourcesHome;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.core.content.ContextCompat;

import com.example.strengthtostrength.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
//
//    private AppBarConfiguration appBarConfiguration;
//    private ActivityMainBinding binding;
    private Toolbar toolbar;
    private Button globalOrgs;
    private Button victims;
    private Button meetTeam;
    private Button weDo;
    private Button sponsors;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        //setupToolbar();
        setUpFAB();

        globalOrgs =(Button) findViewById(R.id.global_organizations);
        globalOrgs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showOrganizations();
            }
        });
        victims =(Button) findViewById(R.id.victims_resources);
        victims.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showResources();
            }
        });
        meetTeam =(Button) findViewById(R.id.meet_team);
        meetTeam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMeetTeam();
            }
        });
        weDo =(Button) findViewById(R.id.what_we_do);
        weDo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {showWhatWeDo();}
        });
        sponsors =(Button) findViewById(R.id.sponsors);
        sponsors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSponsors();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    private void setUpFAB() {
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(toolbar, "Hello, world!", Snackbar.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        return super.onOptionsItemSelected(item);
    }

    private void showOrganizations() {
        Intent intent = new Intent(getApplicationContext(), OrganizationResources.class);
        startActivity(intent);
    }
    private void showResources() {
        Intent intent = new Intent(getApplicationContext(), VictimsResourcesHome.class);
        startActivity(intent);
    }
    private void showMeetTeam() {
        Intent intent = new Intent(getApplicationContext(), VictimsResourcesHome.class);
        startActivity(intent);
    }
    private void showWhatWeDo() {
        Intent intent = new Intent(getApplicationContext(), VictimsResourcesHome.class);
        startActivity(intent);
    }private void showSponsors() {
        Intent intent = new Intent(getApplicationContext(), VictimsResourcesHome.class);
        startActivity(intent);
    }
//
//    @Override
//    public boolean onSupportNavigateUp() {
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
//        return NavigationUI.navigateUp(navController, appBarConfiguration)
//                || super.onSupportNavigateUp();
//    }
}