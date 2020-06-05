package com.example.onegmall;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setSelectedItemId(R.id.home);
        bottomNavigationView.setOnNavigationItemSelectedListener
                (new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()){
                            case R.id.home:
                                return true;
                            case R.id.history:
                                startActivity(new Intent(getApplicationContext(), History.class));
                                overridePendingTransition(0,0);
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

/*    public void todonutcurrency(View view) {
    Intent intent = new Intent(this,DonutCurrencyCheck.class);
        startActivity(intent);
    }

    public void tolifeaftercurrency(View view) {
        Intent intent = new Intent(this,LifeafterCurrencyCheck.class);
        startActivity(intent);
    } */
    }
}
