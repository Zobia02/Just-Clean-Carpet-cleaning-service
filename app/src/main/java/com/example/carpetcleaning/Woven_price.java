package com.example.carpetcleaning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Woven_price extends AppCompatActivity {
    EditText et, Address,Contact,Name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_woven_price);
        et= findViewById(R.id.editTextTextPersonName);
        Address=findViewById(R.id.editTextTextPersonName2);
        Contact=findViewById(R.id.editTextTextPersonName3);
        Name=findViewById(R.id.editTextTextPersonName5);
    }

    public void Woven_checkout(View view) {
        String wovenCarpet=et.getEditableText().toString();
        String Address_string = Address.getEditableText().toString();
        String contact_string = Contact.getEditableText().toString();
        String name=Name.getEditableText().toString();
        if(wovenCarpet.isEmpty()){
            et.setError("Please Enter Area!!!");
            et.requestFocus();
            return;
        }
        if (Address_string.isEmpty()){
            Address.setError("Please Enter your Address!!!");
            et.requestFocus();
            return;
        }
        if(contact_string.isEmpty()){
            Contact.setError("Please Enter your Contact!!!");
            et.requestFocus();
            return;
        }
        if(name.isEmpty()){
            Name.setError("Please Enter your Name!!!");
            et.requestFocus();
            return;
        }
        Intent intent4=new Intent(this,Woven_bill.class);
        intent4.putExtra("NUM",wovenCarpet);
        startActivity(intent4);
    }
}