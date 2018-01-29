package com.droidmarvin.floorlitearduino;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FloorMainActivity extends AppCompatActivity {

    private DatabaseReference mLedReference;

    private LinearLayout mLayoutA, mLayoutB, mLayoutC, mLayoutD;

    private ImageView imageA,imageB, imageC, imageD ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floor_main);

//        mLayoutA = findViewById(R.id.light_a);
//        mLayoutB = findViewById(R.id.light_b);
//        mLayoutC = findViewById(R.id.light_c);
//        mLayoutD = findViewById(R.id.light_c);
//
//        imageA.findViewById(R.id.image_a);
//        imageB.findViewById(R.id.image_b);
//        imageC.findViewById(R.id.image_c);
//        imageD.findViewById(R.id.image_d);




//        mLayoutA.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//                mLedReference = FirebaseDatabase.getInstance().getReference().
//                        child("Users").child("ledStatus");
//                mLedReference.setValue(1);
//
//                imageA.setBackgroundDrawable(getResources().
//                        getDrawable(R.drawable.circlebackgroundgrey));
//            }
//        });

//        mLayoutB.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                mLedReference = FirebaseDatabase.getInstance().getReference().
//                        child("Users").child("ledStatus");
//                mLedReference.setValue(1);
//
//                imageB.setBackgroundDrawable(getResources().
//                        getDrawable(R.drawable.circlebackgroundgrey));
//
//            }
//        });

//        mLayoutC.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                mLedReference = FirebaseDatabase.getInstance().getReference().
//                        child("Users").child("ledStatus");
//                mLedReference.setValue(1);
//
//                imageC.setBackgroundDrawable(getResources().
//                        getDrawable(R.drawable.circlebackgroundgrey));
//
//            }
//        });
//
//        mLayoutD.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                mLedReference = FirebaseDatabase.getInstance().getReference().
//                        child("Users").child("ledStatus");
//                mLedReference.setValue(1);
//
//                imageD.setBackgroundDrawable(getResources().
//                        getDrawable(R.drawable.circlebackgroundgrey));
//            }
//        });
    }
}

