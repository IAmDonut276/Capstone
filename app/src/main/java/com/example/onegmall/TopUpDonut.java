package com.example.onegmall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TopUpDonut extends AppCompatActivity {

    Button btn;
    EditText et;
    String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_up_donut);

        btn=findViewById(R.id.button3);
        et=findViewById(R.id.editText3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TopUpDonut.this,Checkout.class);
                st=et.getText().toString();
                intent.putExtra("Id",st);
                startActivity(intent);
            }
        });
    }
}
