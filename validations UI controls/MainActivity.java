package com.example.ui;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name_et, email_et, age_et;
    Button submit_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name_et = findViewById(R.id.name_et);
        email_et = findViewById(R.id.email_et);
        age_et = findViewById(R.id.age_et);
        submit_btn = findViewById(R.id.submit_btn);
        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name_et.setError(null);
                age_et.setError(null);
                email_et.setError(null);
                String name_txt = name_et.getText().toString();
                String email_txt = email_et.getText().toString();
                String age_txt = age_et.getText().toString();

                if (name_txt.equals("")) {
                    name_et.setError("Please enter your name");
                    name_et.requestFocus();
                } else if (email_txt.equals("")) {
                    email_et.setError("Please enter your email id");
                    email_et.requestFocus();
                } else if (age_txt.equals("")) {
                    age_et.setError("Please enter your age");
                    age_et.requestFocus();
                } else {

                    Toast.makeText(getApplicationContext(), "Form Submitted Successfully", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}