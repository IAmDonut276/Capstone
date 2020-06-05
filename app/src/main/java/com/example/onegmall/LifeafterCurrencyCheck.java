package com.example.onegmall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LifeafterCurrencyCheck extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifeafter_currency_check);
    }

    public void totopuplifeafter(View view) {
        Intent intent = new Intent(this,TopUpLifeafter.class);
        startActivity(intent);
    }
}
