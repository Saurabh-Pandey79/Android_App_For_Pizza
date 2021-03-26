package com.example.pizzamania;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Veg extends AppCompatActivity {
    RadioGroup r1, r3;
    RadioButton rb1,  rb3;
    String s1, s2 = "", s3, q1, s5, s6, s7, s8;
    int total, s_p, q, s11, s13, t1, c_t = 0;
    EditText e1;
    CheckBox c1, c2, c3, c4, c5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veg);
        e1 = findViewById(R.id.editText2);
        r1 = findViewById(R.id.vr1);
        c1 = findViewById(R.id.checkBox);
        c2 = findViewById(R.id.checkBox2);
        c3 = findViewById(R.id.checkBox3);
        c4 = findViewById(R.id.checkBox4);
        c5 = findViewById(R.id.checkBox5);
        r3 = findViewById(R.id.vr3);

    }

    public void onButtonClick(View v) {
        Intent final1 = new Intent(this, final1.class);
        q1 = e1.getText().toString();
        if (!"".equals(q1)) {
            q = Integer.parseInt(q1);//quantity variable for calculation part
        }
        s11 = r1.getCheckedRadioButtonId();

        s13 = r3.getCheckedRadioButtonId();
        if (s11 != -1) {
            rb1 = findViewById(s11);
            s1 = rb1.getText().toString();
        }

        if (s13 != -1) {
            rb3 = findViewById(s13);
            s3 = rb3.getText().toString();
            if (s3.equalsIgnoreCase("Large")) {
                s_p = 500;
            } else if (s3.equalsIgnoreCase("Medium")) {
                s_p = 250;
            } else {
                s_p = 100;
            }
        }
        if (c1.isChecked()) {
            c_t += 50;
        }
        if (c2.isChecked()) {
            c_t += 75;
        }
        if (c3.isChecked()) {
            c_t += 35;
        }
        if (c4.isChecked()) {
            c_t += 15;
        }
        if (c5.isChecked()) {
            c_t += 50;
        }
        if (c1.isChecked()) {
            s2 += "\n" + c1.getText().toString();
        }
        if (c2.isChecked()) {
            s2 += "\n" + c2.getText().toString();
        }
        if (c3.isChecked()) {
            s2 += "\n" + c3.getText().toString();
        }
        if (c4.isChecked()) {
            s2 += "\n" + c4.getText().toString();
        }
        if (c5.isChecked()) {
            s2 += "\n" + c5.getText().toString();
        }
        if (c_t == 0) {
            total = s_p * q;
        }
        else {
            total = (s_p + c_t) * q;
        }
            t1 = q * s_p;
            s5 = Integer.toString(c_t);
            s6 = Integer.toString(s_p);
            s7 = Integer.toString(t1);
            s8 = Integer.toString(total);
            final1.putExtra("pizza_name", s1);
            final1.putExtra("topping_name", s2);
            final1.putExtra("quantity", q1);
            final1.putExtra("size", s3);
            final1.putExtra("t_p", s5);
            final1.putExtra("s_p", s6);
            final1.putExtra("t1", s7);
            final1.putExtra("total", s8);
            startActivity(final1);
            finish();

        }
    }
