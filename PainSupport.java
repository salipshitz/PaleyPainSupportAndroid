package com.saar.developer.starfishsupport;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;

public class PainSupport extends Activity {

    SharedPreferences prefs;
    Settings settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pain);

        settings = new Settings();

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.nav_bar);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Intent intent;
                switch (item.getItemId()) {
                    case R.id.pain:
                        intent = new Intent(PainSupport.this, PainSupport.class);
                        startActivity(intent);
                        break;
                    case R.id.social:
                        intent = new Intent(PainSupport.this, SupportOthers.class);
                        startActivity(intent);
                        break;
                }
                return false;
            }
        });

        prefs = getSharedPreferences("com.saar.developer.starfishsupport", MODE_PRIVATE);
    }

    @Override
    protected void onResume() {
        super.onResume();

        if (prefs.getBoolean("firstrun", true)) {
            settings.lengtheningAlert(this);
            prefs.edit().putBoolean("firstrun", false);
        }
    }

}


