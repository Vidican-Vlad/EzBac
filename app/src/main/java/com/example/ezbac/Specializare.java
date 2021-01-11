package com.example.ezbac;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Specializare extends AppCompatActivity {
    String materie;
    Intent prev,next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        prev=getIntent();
        next = new Intent(this,AN.class);
        setContentView(R.layout.activity_specializare);
        String  ceva = prev.getStringExtra("extra");
        Button b1 = (Button)findViewById(R.id.option1);
        Button b2 = (Button)findViewById(R.id.option2);
        Button b3 = (Button)findViewById(R.id.option3);
        Button b4 = (Button)findViewById(R.id.option4);
        materie=ceva;

        switch(ceva){
            case "MATE_":
                b3.setVisibility(View.VISIBLE);
                b4.setVisibility(View.VISIBLE);
                b2.setText("MATE-INFO");
                b1.setText("STIINTELE NATURII");
                b3.setText("TEHNIC");
                b4.setText("PEDAGOGIC");
                break;
            case "ROMANA_":
                b2.setText("UMAN");
                b1.setText("TEHNIC");
                break;
            case "CHIMIE_":
                b2.setText("ORGANICA");
                b1.setText("ANORGANICA");
                break;
            case "FIZICA_":
                b2.setText("TEHNIC");
                b1.setText("TEORETIC");
                break;
            case "INFORMATICA_":
                b2.setText("INFO-INTENSIV");
                b1.setText("STIINTELE NATURII");
                break;
            case "BIOLOGIE_":
                b2.setText("ANATOMIE");
                b1.setText("VEGETALA SI ANIMALA");
                break;

        }
    }
    public void Clicked(View v)
    {
        Button X = (Button)findViewById(v.getId());
        String Choice = (X.getText().toString())+"_";
        switch (materie){
            case "ROMANA_":
                Romana(Choice);
                break;
            case "CHIMIE_":
                Chimie(Choice);
                break;
            case "INFORMATICA_":
                Informatica(Choice);
                break;
            case "BIOLOGIE_":
                Biologie(Choice);
                break;
            case "FIZICA_":
                fizica(Choice);
                break;
            case "MATE_":
                Mate(Choice);
                break;
        }
    }
    public void Romana(String Choice)
    {

        if(Choice.equals("UMAN_"))
            next.putExtra("extra","RO_UMAN_");
        else
            next.putExtra("extra","RO_TEHNOLOGIC_");

        startActivity(next);
    }
    public void Chimie(String Choice)
    {
        next.putExtra("extra",prev.getStringExtra("extra")+Choice);
        startActivity(next);
    }
    public void Biologie (String Choice)
    {
        if(Choice.equals("ANATOMIE_"))
        {
            next.putExtra("extra","BIO_ANATOMIE_");
        }
        else
        {
            next.putExtra("extra","BIO_ANIMALA_");
        }
        startActivity(next);
    }
    public void Informatica(String Choice)
    {
        if(Choice.equals("INFO-INTENSIV_"))
        {
            next.putExtra("extra","INFO_M1_");
        }
        else
        {
            next.putExtra("extra","INFO_M2_");
        }
        startActivity(next);
    }
    public void Mate(String Choice)
    {
        switch (Choice)
        {
            case "MATE-INFO_":
                next.putExtra("extra","MATE_M1_");
                break;
            case "STIINTELE NATURII_":
                next.putExtra("extra","MATE_M2_");
                break;
            case "TEHNIC_":
                next.putExtra("extra","MATE_M3_");
                break;
            case "PEDAGOGIC_":
                next.putExtra("extra","MATE_PEDA_");
                break;
        }

        startActivity(next);
    }
    public void fizica(String Choice)
    {
        if(Choice.equals("TEHNIC_"))
        {
            next.putExtra("extra","FIZICA_TEHNOLOGICA_");
        }
        else
        {
            next.putExtra("extra","FIZICA_TEORETICA_");
        }
        startActivity(next);
    }
}