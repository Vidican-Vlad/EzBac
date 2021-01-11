package com.example.ezbac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
   public  void SelectSubject(View v)
   {
       Intent intent=new Intent();
       Button b = (Button)findViewById(v.getId());
       String name=  b.getText().toString();
       if(name.equals("MATE") || name.equals("FIZICA") || name.equals("ROMANA") || name.equals("INFORMATICA") || name.equals("CHIMIE") || name.equals("BIOLOGIE") )
       {
           intent = new Intent(this,Specializare.class);
       }
       else
       {
           intent = new Intent(this, AN.class);
       }
       intent.putExtra("extra",name+"_");
       startActivity(intent);
   }
}