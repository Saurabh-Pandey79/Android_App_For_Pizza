package com.example.pizzamania;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

public class choose extends AppCompatActivity {
    int sl;
    int ik;
    String st,selection;
    TextView t11;
    RadioGroup rg1;
    RadioButton r1;
    Button b12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
        t11 = findViewById(R.id.textView5);
        st = getIntent().getExtras().getString("name1");
        t11.setText("Hello And Welcome "+ st.toUpperCase());
        b12 = findViewById(R.id.button2);
        rg1 = findViewById(R.id.radioGroup);
    }
        public void onButtonCLick(View v){
            ik=rg1.getCheckedRadioButtonId();
            if(ik != -1) {
                r1 = findViewById(ik);
                selection = r1.getText().toString();
            }
            if (selection.equalsIgnoreCase("Veg")) {
                    openActivity2();
                } else {
                    openActivity3();
                }
        }

    private void openActivity3() {
        Intent intent1=new Intent(this, NonVeg.class);
        startActivity(intent1);
        finish();

    }

    private void openActivity2() {
        Intent intent2=new Intent(this, Veg.class);
        startActivity(intent2);
        finish();
    }
}
