package com.saar.developer.starfishsupport;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class SupportOthers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_support);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.nav_bar);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Intent intent;
                switch (item.getItemId()) {
                    case R.id.pain:
                        intent = new Intent(SupportOthers.this, PainSupport.class);
                        startActivity(intent);
                        break;
                    case R.id.social:
                        intent = new Intent(SupportOthers.this, SupportOthers.class);
                        startActivity(intent);
                        break;
                    case R.id.waiting:
                        //TODO: Define intent and create class for waiting room
                        break;
                }
                return false;
            }
        });


    }
}
