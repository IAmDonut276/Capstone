package com.example.onegmall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void SignIn(View view) {
        Intent intent = new Intent(this,Menu.class);
        startActivity(intent);
    }
    public void Signup(View view) {
        Intent intent=new Intent(this, SignUp.class);
        startActivity(intent);
    }


}
