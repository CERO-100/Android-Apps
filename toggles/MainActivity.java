
package com.example.toggleimg;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton toggle_img_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggle_img_btn = findViewById(R.id.toggle_img_btn);
        toggle_img_btn.setOnClickListener(v -> {

            if (toggle_img_btn.isChecked()) {
                toggle_img_btn.setBackgroundResource(R.drawable.baseline_volume_up_24);

                Toast.makeText(getApplicationContext(), "Volume Up.", Toast.LENGTH_SHORT).show();
            } else {

                toggle_img_btn.setBackgroundResource(R.drawable.baseline_volume_mute_24);
                Toast.makeText(getApplicationContext(), "Volume Mute.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}