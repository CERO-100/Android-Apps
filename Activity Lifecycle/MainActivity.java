package com.example.activitycycle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override 
 
         protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main); 
         Log.d("life cycle","onCreate invoked"); 
         Toast.makeText(getApplicationContext(),"onCreate invoked",Toast. LENGTH_SHORT).show(); 
    } 
   @Override    
        protected void onStart() 
    {   super.onStart(); 
        Log.d("life cycle","onStart invoked"); 
        Toast.makeText(getApplicationContext(),"onStart invoked",Toast.LENGTH_SHORT).show(); 
    } 
    @Override    
        protected void onResume() 
    { 
        super.onResume(); 
        Log.d("life cycle","onResume invoked"); 
        Toast.makeText(getApplicationContext(),"onResume invoked",Toast.LENGTH_SHORT).show(); 
    } 
   @Override    
        protected void onPause() 
    { 
        super.onResume(); 
        Log.d("life cycle","onPause invoked"); 
        Toast.makeText(getApplicationContext(),"onPause invoked",Toast.LENGTH_SHORT).show();       
    } 
   @Override     
         protected void onStop() 
    {         super.onStop(); 
        Log.d("life cycle","onStop invoked"); 
        Toast.makeText(getApplicationContext(),"onStop invoked",Toast.LENGTH_SHORT).show(); 
    } 
    @Override
            protected void onRestart() 
    {         super.onRestart(); 
        Log.d("life cycle","onRestart invoked"); 
        Toast.makeText(getApplicationContext(),"onRestart invoked",Toast.LENGTH_SHORT).show(); 
    } 
   @Override     
protected void onDestroy() 
    {         super.onDestroy(); 
        Log.d("life cycle","onDestroy invoked"); 
        Toast.makeText(getApplicationContext(),"onDestroy invoked",Toast.LENGTH_SHORT).show(); 
    } 
}