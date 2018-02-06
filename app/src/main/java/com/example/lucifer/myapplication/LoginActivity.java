package com.example.lucifer.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button add= (Button) findViewById(R.id.abttn) ;
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                TextView res = (TextView) findViewById(R.id.result);
                EditText fnum=(EditText) findViewById(R.id.fnum);
                int f= Integer.parseInt(fnum.getText().toString());
                EditText snum=(EditText) findViewById(R.id.snum);
                int s= Integer.parseInt(snum.getText().toString());
                int r= f+s;
                res.setText(r +"");

            }

        });
        Button sub= (Button) findViewById(R.id.sbttn) ;
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                TextView res = (TextView) findViewById(R.id.result);
                EditText fnum=(EditText) findViewById(R.id.fnum);
                int f2= Integer.parseInt(fnum.getText().toString());
                EditText snum=(EditText) findViewById(R.id.snum);
                int s2= Integer.parseInt(snum.getText().toString());
                int r2= f2-s2;
                res.setText(r2 +"");

            }

        });
        Button mul= (Button) findViewById(R.id.mbttn) ;
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                TextView res = (TextView) findViewById(R.id.result);
                EditText fnum=(EditText) findViewById(R.id.fnum);
                int f3= Integer.parseInt(fnum.getText().toString());
                EditText snum=(EditText) findViewById(R.id.snum);
                int s3= Integer.parseInt(snum.getText().toString());
                int r3= f3*s3;
                res.setText(r3 +"");

            }

        });
        Button div= (Button) findViewById(R.id.dbttn) ;
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                TextView res = (TextView) findViewById(R.id.result);
                EditText fnum=(EditText) findViewById(R.id.fnum);
                double f4= Integer.parseInt(fnum.getText().toString());
                EditText snum=(EditText) findViewById(R.id.snum);
                double s4= Integer.parseInt(snum.getText().toString());
                double r4= f4/s4;
                res.setText(r4 +"");

            }

        });

        Button cos= (Button) findViewById(R.id.cos) ;
        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                TextView res = (TextView) findViewById(R.id.result);
                EditText fnum=(EditText) findViewById(R.id.fnum);
                int f= Integer.parseInt(fnum.getText().toString());




                double d = Math.cos(Math.toRadians(f));
                    res.setText(d +"");

            }

        });
        Button sin= (Button) findViewById(R.id.sin) ;
        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                TextView res = (TextView) findViewById(R.id.result);
                EditText fnum=(EditText) findViewById(R.id.fnum);
                int f= Integer.parseInt(fnum.getText().toString());




                double d = Math.sin(Math.toRadians(f));
                res.setText(d +"");

            }

        });
        Button tan= (Button) findViewById(R.id.tan) ;
        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                TextView res = (TextView) findViewById(R.id.result);
                EditText fnum=(EditText) findViewById(R.id.fnum);
                int f= Integer.parseInt(fnum.getText().toString());




                double d = Math.tan(Math.toRadians(f));
                res.setText(d +"");

            }

        });
        Button root= (Button) findViewById(R.id.root) ;
        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                TextView res = (TextView) findViewById(R.id.result);
                EditText fnum=(EditText) findViewById(R.id.fnum);
                int f= Integer.parseInt(fnum.getText().toString());




                double d = Math.sqrt(f);
                res.setText(d +"");

            }

        });
        Button power = (Button) findViewById(R.id.power) ;
        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                TextView res = (TextView) findViewById(R.id.result);
                EditText fnum=(EditText) findViewById(R.id.fnum);
                int f= Integer.parseInt(fnum.getText().toString());
                EditText snum=(EditText) findViewById(R.id.snum);
                int s3= Integer.parseInt(snum.getText().toString());



                double d = Math.pow(f,s3);
                res.setText(d +"");

            }

        });



    }}

