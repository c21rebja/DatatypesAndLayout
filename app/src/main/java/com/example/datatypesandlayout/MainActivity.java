package com.example.datatypesandlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Mountain testMount = new Mountain(670, "Pleasant Mountain", "Antarctic", true, 3402);
        Log.d("enTagg", testMount.getName());
    }
}