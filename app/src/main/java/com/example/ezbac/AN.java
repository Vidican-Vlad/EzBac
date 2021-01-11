package com.example.ezbac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AN extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mate_m1);

    }

    public void SelectYear(View v) {
        Intent i = getIntent();
        String extra = i.getStringExtra("extra");
        Button b = ((Button) findViewById(v.getId()));
        String name = extra + (b.getText().toString()) + "_";
        Intent intent = new Intent(this, SESIUNE.class);
        intent.putExtra("extra", name);
        startActivity(intent);
    }

}