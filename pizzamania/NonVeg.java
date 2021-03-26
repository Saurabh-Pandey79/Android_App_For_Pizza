package com.example.pizzamania;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class NonVeg extends AppCompatActivity {
    RadioGroup r1,r3;
    RadioButton rb1,rb3;
    String s1,s2="",s3,q1,s5,s6,s7,s8;
    int total,s_p,q,s11,s13,t1,c_t=0;
    EditText e1;
    CheckBox c1,c2,c3,c4,c5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_non_veg);
        e1= findViewById(R.id.editText2);
        r1=findViewById(R.id.nr1);
        r3=findViewById(R.id.nr3);
        c1 = findViewById(R.id.checkBox);
        c2 =  findViewById(R.id.checkBox2);
        c3 =  findViewById(R.id.checkBox3);
        c4 =  findViewById(R.id.checkBox4);
        c5 = findViewById(R.id.checkBox5);

    }
    public void onButtonClick(View v){
        Intent final2=new Intent(this,final2.class);
        q1=e1.getText().toString();
        if(!"".equals(q1)) {
            q = Integer.parseInt(q1);
        }
        s11=r1.getCheckedRadioButtonId();
        s13=r3.getCheckedRadioButtonId();
        if(s13 != -1){
            rb3=findViewById(s13);
            s3=rb3.getText().toString();
            if (s3.equalsIgnoreCase("Large")){
                s_p=500;
            }
            else if (s3.equalsIgnoreCase("Medium")){
                s_p=250;
            }
            else{
                s_p=100;
            }
        }
        if (s11 != -1) {
            rb1 =  findViewById(s11);
            s1=rb1.getText().toString();
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

        t1=q*s_p;

        s5=Integer.toString(c_t);
        s6=Integer.toString(s_p);
        s7=Integer.toString(t1);
        s8=Integer.toString(total);
        final2.putExtra("pizzan_name",s1);
        final2.putExtra("toppingn_name",s2);
        final2.putExtra("quantityn",q1);
        final2.putExtra("sizen",s3);
        final2.putExtra("totaln",s8);
        final2.putExtra("t_pn",s5);
        final2.putExtra("s_pn",s6);
        final2.putExtra("t1n",s7);
        startActivity(final2);
        finish();

    }
}
