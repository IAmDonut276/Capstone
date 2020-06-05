package com.example.onegmall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DonutCurrencyCheck extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donut_currency_check);
    }

    public void totopupdonut(View view) {
        Intent intent = new Intent(this, TopUpDonut.class);
        startActivity(intent);
    }
}
