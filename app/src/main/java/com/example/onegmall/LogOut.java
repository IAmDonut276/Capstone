package com.example.onegmall;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;

public class LogOut extends AppCompatActivity {
    Button btnLogout;
    FirebaseAuth mFirebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_out);

        btnLogout =findViewById(R.id.logoutBtn);
        mFirebaseAuth=FirebaseAuth.getInstance();

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intent =new Intent(LogOut.this, MainActivity.class);
                startActivity(intent);
            }
        });

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setSelectedItemId(R.id.logout);
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
                                startActivity(new Intent(getApplicationContext(), History.class));
                                overridePendingTransition(0,0);
                                return true;
                            case R.id.feedback:
                                startActivity(new Intent(getApplicationContext(), Feedback.class));
                                overridePendingTransition(0,0);
                                return true;
                            case R.id.logout:
                                return true;
                        }
                        return false;
                    }
                });
    }
}
