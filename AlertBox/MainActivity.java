package com.example.gridviewdr;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView wifi_btn, bluetooth_btn, volume_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wifi_btn = findViewById(R.id.wifi_btn);
        bluetooth_btn = findViewById(R.id.bluetooth_btn);
        volume_btn = findViewById(R.id.volume_btn);

        wifi_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myAlertBox("Album Option");
            }
        });

        bluetooth_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myAlertBox("Mail Option");
            }
        });

        volume_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myAlertBox("Money Option");
            }
        });
    }

    public void myAlertBox(String buttonname) {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage(("Click OK to select option"));
        builder.setTitle("Alert!");
        builder.setCancelable(false);
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                Toast.makeText(getApplicationContext(), buttonname + "is successfully selected", Toast.LENGTH_SHORT)
                        .show();
            }
        });

        builder.setNegativeButton("No", (DialogInterface.OnClickListener) (dialog, which) -> {
            dialog.cancel();
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}