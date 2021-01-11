package com.example.ezbac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Final extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

    }

    public void viewPDF(View v)
    {
        Intent i = getIntent();
        String extra = i.getStringExtra("extra");
        Button b = ((Button) findViewById(v.getId()));
        String name = extra + b.getText().toString();
        Intent intent = new Intent(this,PDF.class);
        intent.putExtra("extra",name);
        startActivity(intent);

    }
}