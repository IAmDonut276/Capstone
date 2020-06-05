package com.example.onegmall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TopUpLifeafter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_up_lifeafter);
    }

    public void tocheckout(View view) {
        Intent intent = new Intent(this,Checkout.class);
        startActivity(intent);
    }
}
