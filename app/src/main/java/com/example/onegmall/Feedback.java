package com.example.onegmall;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.database.FirebaseDatabase;

public class Feedback extends AppCompatActivity {
    EditText email;
    EditText message;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setSelectedItemId(R.id.feedback);
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
                                return true;
                            case R.id.logout:
                                startActivity(new Intent(getApplicationContext(), LogOut.class));
                                overridePendingTransition(0,0);
                                return true;
                        }
                        return false;
                    }
                });

        email = (EditText)findViewById(R.id.editText2);
        message =(EditText)findViewById(R.id.editText);
        btn = findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Feedback.this,"Feedback Received", Toast.LENGTH_SHORT).show();
                email.setText("");
                message.setText("");
            }
        });

    }
}
