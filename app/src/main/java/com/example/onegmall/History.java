package com.example.onegmall;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class History extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setSelectedItemId(R.id.history);
        bottomNavigationView.setOnNavigationItemSelectedListener
                (new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()){
                            case R.id.home:
                                startActivity(new Intent(getApplicationContext(), Menu.class));
                                overridePendingTransition(0,0);
                                return true;
                            case R.id.history:
                                return true;
                            case R.id.feedback:
                                startActivity(new Intent(getApplicationContext(), Feedback.class));
                                overridePendingTransition(0,0);
                                return true;
                            case R.id.logout:
                                startActivity(new Intent(getApplicationContext(), LogOut.class));
                                overridePendingTransition(0,0);
                                return true;
                        }
                        return false;
                    }
                });
    }
}
