package com.example.onegmall;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Currency;

public class DonutCurrencyCheck extends AppCompatActivity {

    Button btn;
    TextView txt;
    DatabaseReference myRef;
    String TAG ="g";
    FirebaseDatabase database=FirebaseDatabase.getInstance();
    FirebaseAuth mAuth=FirebaseAuth.getInstance();
    String userID;
    Long c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donut_currency_check);

        myRef= database.getReference();
        FirebaseUser user =mAuth.getCurrentUser();
        userID= user.getUid();
        txt =findViewById(R.id.textView5);
        btn=findViewById(R.id.button5);

// Read from the database
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                showData(dataSnapshot);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Long C = new Long(c+100);
                myRef.child(userID).child("currency").setValue(C);
            }
        });
    }

    private void showData(DataSnapshot dataSnapshot) {
        for(DataSnapshot ds : dataSnapshot.getChildren()){
            UserInfo uData = new UserInfo();
            c=(Long)ds.child("currency").getValue();
            //uData.setCurrency(ds.child(userID).getValue(UserInfo.class).getCurrency());
            //uData.setLifeAfter(ds.child(userID).getValue(UserInfo.class).getLifeAfter());

            //display all the items
            Log.d(TAG, "showData: Donut Cafe: "+ uData.getCurrency());
            //Log.d(TAG,"showData: LifeAfter: "+ uData.getLifeAfter());

            txt.setText(c.toString());
        }
    }

    public void totopupdonut(View view) {
        Intent intent = new Intent(this, TopUpDonut.class);
        startActivity(intent);
    }




}
