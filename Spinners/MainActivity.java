package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    String[] designations = { "Select a bird", "Parrot", "Crow", "Pigeon", "Eagle", "Cuckoo" };

@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);

spinner=findViewById(R.id.spinner);
spinner.setSelection(0,false);
ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,
designations);
adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
spinner.setAdapter(adapter);
spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

@Override
public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

78

Toast.makeText(getApplicationContext(),"Selected bird is:"+designations,
Toast.LENGTH_SHORT).show();
}

@Override
public void onNothingSelected(AdapterView<?>adapterView) {
}
});
}
}