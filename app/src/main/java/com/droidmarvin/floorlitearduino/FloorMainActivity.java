package com.droidmarvin.floorlitearduino;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.google.firebase.database.DatabaseReference;

public class FloorMainActivity extends AppCompatActivity {

    private DatabaseReference mLedReference;

    private LinearLayout mLayoutA, mLayoutB, mLayoutC, mLayoutD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floor_main);

        mLayoutA = findViewById(R.id.light_a);
        mLayoutB = findViewById(R.id.light_b);
        mLayoutC = findViewById(R.id.light_c);
        mLayoutD = findViewById(R.id.light_c);


    }
}

