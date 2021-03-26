package com.example.pizzamania;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class final2 extends AppCompatActivity {
    String s1,s2,s3,s4,s5,s6,s7,s8;
    TextView t1,t2,t3,t4,t5,t6,t7,t8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final2);
        t1=findViewById(R.id.pizza_name);
        t2=findViewById(R.id.topping_name);
        t3=findViewById(R.id.size_name);
        t4=findViewById(R.id.quantity);
        t5=findViewById(R.id.topping);
        t6=findViewById(R.id.size);
        t7=findViewById(R.id.tq);
        t8=findViewById(R.id.total_amount);
        s1 = getIntent().getExtras().getString("pizzan_name");
        s2 = getIntent().getExtras().getString("toppingn_name");
        s3 = getIntent().getExtras().getString("sizen");
        s4 = getIntent().getExtras().getString("quantityn");
        s5 = getIntent().getExtras().getString("t_pn");
        s6 = getIntent().getExtras().getString("s_pn");
        s7 = getIntent().getExtras().getString("t1n");
        s8 = getIntent().getExtras().getString("totaln");
       t1.setText(s1);
       t2.setText(s2);
       t3.setText(s3);
       t4.setText(s4);
       t5.setText(s5);
       t6.setText(s6);
       t7.setText(s7);
       t8.setText(s8);
    }
    public void onButtonClick(View v){
        Intent i2=new Intent(this, MainActivity.class);
        startActivity(i2);
        finish();
    }
}
