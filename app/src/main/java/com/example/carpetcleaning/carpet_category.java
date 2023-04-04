package com.example.carpetcleaning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class carpet_category extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carpet_category);
    }


    public void TuftedCarpetPricing(View view) {
        Intent intent2 = new Intent(this,Tufted_price.class);
        startActivity(intent2);
    }

    public void WovenCarpetPricing(View view) {
        Intent intent3 = new Intent(this,Woven_price.class);
        startActivity(intent3);
    }
}