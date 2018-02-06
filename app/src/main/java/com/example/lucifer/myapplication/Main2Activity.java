package com.example.lucifer.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
   public  class classid {
       public  String Newid(){
       EditText Nid = (EditText) findViewById(R.id.newid);
       String NI = Nid.getText().toString();
       return NI;}
   }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


         class password{
        EditText Npas= (EditText)findViewById(R.id.newpass);

        String NP = Npas.getText().toString();}

        Button submit =(Button)findViewById(R.id.submit);

        submit.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {







            }
        }));







    }
}
