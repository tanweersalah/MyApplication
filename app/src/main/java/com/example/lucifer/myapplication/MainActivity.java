package com.example.lucifer.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
  private   int c = 5;
 private    EditText id;
    private EditText p;
    private Button log;
  private   TextView attmp;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        id = (EditText) findViewById(R.id.id);
        p = (EditText) findViewById(R.id.password);
        log = (Button) findViewById(R.id.login);
        attmp = (TextView) findViewById(R.id.attempt);
        attmp.setText("attempts remaining is 5");

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(id.getText().toString(),p.getText().toString());
                attmp.setText("attempts remaining is "+ String.valueOf(c));



            }
        });

    }

    private void validate(String uname ,String ps){
        Main2Activity.classid.
        String q = "tanweer";
        String w = "1234";
        if (uname.equals(q)&& ps.equals(w)){
            Intent go =new Intent(MainActivity.this,LoginActivity.class);
            startActivity(go);}
        else {
            c--;
            attmp.setText("attempts remaining is "+ String.valueOf(c));
            if (c==0){
                log.setEnabled(false);

            }




        }





    }}





















