package com.example.ezbac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;

public class SESIUNE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m1_2019);
        Intent i = getIntent();
        String prev = i.getStringExtra("extra");
        Button b = (Button)findViewById(R.id.SS);
        try {
            if(!Arrays.asList(getResources().getAssets().list("")).contains(prev+"SS_BAREM.pdf"))
                b.setVisibility(View.INVISIBLE);
        } catch (IOException e) {

           e.printStackTrace();
        }
    }
    public void SelectSession(View v)
    {
        Button b = ((Button)findViewById(v.getId()));
        Intent i = getIntent();
        String ceva = i.getStringExtra("extra");
        String name;
        if(b.getText().toString().equals("SESIUNE SPECIALA"))
        {
            name = ceva +"SS_";
        }
        else
        {
            name = ceva + b.getText().toString()+"_";
        }
        Intent intent = new Intent(this, Final.class);
        intent.putExtra("extra",name);
        startActivity(intent);
    }
}