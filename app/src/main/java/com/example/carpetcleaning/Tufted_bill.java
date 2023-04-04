package com.example.carpetcleaning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tufted_bill extends AppCompatActivity {
   private Button hmbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tufted_bill);
        TextView txt=findViewById(R.id.textView11);
        Intent intent6=getIntent() ;
        String b=intent6.getStringExtra("NUM");
        int bill=Integer.valueOf(b)*5000;    /* converting in to integer*/
        String B=String.valueOf(bill);      /*converting into string to put into textview */
        txt.setText(B);
        hmbutton=(Button) findViewById(R.id.button4);
        hmbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=getPackageManager().getLaunchIntentForPackage("com.example.navdrawer");
                startActivity(i);
            }
        });

    }
}