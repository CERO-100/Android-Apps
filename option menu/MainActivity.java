package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

65
import androidx.appcompat.widget.Toolbar;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

@Override
public boolean onOptionsItemSelected(@NonNull MenuItem item) {
int id = item.getItemId();
if(id==R.id.menu_option_1) {

Toast.makeText(this,"Page1 clicked",Toast.LENGTH_SHORT).show();
return true;
}
else if (id==R.id.menu_option_2) {

Toast.makeText(this,"Page2 clicked",Toast.LENGTH_SHORT).show();

66

return true;
}
return super.onOptionsItemSelected(item);
}
}