package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText number1, number2;
    TextView result_text;
    Button add_btn, sub_btn, mul_btn, div_btn, clear_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        result_text = findViewById(R.id.result_text);
        add_btn = findViewById(R.id.add_btn);
        sub_btn = findViewById(R.id.sub_btn);
        mul_btn = findViewById(R.id.mul_btn);
        div_btn = findViewById(R.id.div_btn);
        clear_btn = findViewById(R.id.clear_btn);

        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number1_text = number1.getText().toString();
                String number2_text = number2.getText().toString();
                int num1 = Integer.parseInt(number1_text);
                int num2 = Integer.parseInt(number2_text);
                float sum = num1 + num2;
                result_text.setText("The addition of the two number is:" + sum);

                Toast.makeText(getApplicationContext(), "The addition of the two numbers is:" + sum, Toast.LENGTH_SHORT)
                        .show();
            }
        });

        sub_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number1_text = number1.getText().toString();
                String number2_text = number2.getText().toString();
                int num1 = Integer.parseInt(number1_text);
                int num2 = Integer.parseInt(number2_text);
                float sub = num1 - num2;
                result_text.setText("The subtraction of the two number is:" + sub);
                Toast.makeText(getApplicationContext(), "The subtraction of the two numbers is:" + sub,
                        Toast.LENGTH_SHORT).show();
            }
        });

        mul_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number1_text = number1.getText().toString();
                String number2_text = number2.getText().toString();
                int num1 = Integer.parseInt(number1_text);
                int num2 = Integer.parseInt(number2_text);
                float mul = num1 * num2;
                result_text.setText("The multiplication of the two number is:" + mul);
                Toast.makeText(getApplicationContext(), "The multiplication of the two numbers is:" + mul,
                        Toast.LENGTH_SHORT).show();
            }
        });

        div_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number1_text = number1.getText().toString();
                String number2_text = number2.getText().toString();
                int num1 = Integer.parseInt(number1_text);
                int num2 = Integer.parseInt(number2_text);
                float div = num1 / num2;
                result_text.setText("The division of the two number is:" + div);

                Toast.makeText(getApplicationContext(), "The division of the two numbers is:" + div, Toast.LENGTH_SHORT)
                        .show();
            }
        });

        clear_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number1.setText("");
                number2.setText("");
                result_text.setText((""));
                Toast.makeText(getApplicationContext(), "Inputs Cleared....", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
