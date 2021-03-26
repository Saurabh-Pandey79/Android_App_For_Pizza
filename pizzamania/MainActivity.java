package com.example.pizzamania;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button b11;
    String s1,s2;
    EditText e11,e12;
    int nm1,nn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e11=findViewById(R.id.editText3);
        e12=findViewById(R.id.editText);
        b11=findViewById(R.id.button);

    }
    public void onButtonClick(View v){
        Intent i= new Intent(MainActivity.this,choose.class);
        Intent i2 = new Intent(this, MainActivity.class);
        s1=e11.getText().toString();
        nm1=s1.length();
        if(nm1>2) {
                s2 = e12.getText().toString();
                nn1 = s2.length();
                if (nn1 == 10) {
                    i.putExtra("name1", s1);
                    i.putExtra("number", s2);
                    startActivity(i);
                    finish();
                }
                else{
                    Toast.makeText(MainActivity.this, "Please Enter A Valid Phone Number", Toast.LENGTH_LONG).show();
                    startActivity(i2);
                }
        }
        else {
                Toast.makeText(MainActivity.this, "Please Enter Your Full Name", Toast.LENGTH_LONG).show();
                startActivity(i2);
            }
        }

    }


