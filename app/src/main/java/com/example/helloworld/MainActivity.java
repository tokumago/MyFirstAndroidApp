package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Implement the OnClickListener callback
    public void subbtnChangeLang(View v) {
        // do something when the button is clicked
        TextView output = findViewById(R.id.hola);
        if (output.getText().equals("¡Hola mundo!")){
            output.setText("");
        }else
        {
            output.setText("¡Hola mundo!");
        }
    }
}