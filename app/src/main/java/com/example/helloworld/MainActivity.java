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
    Locale myLocale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Implement the OnClickListener callback
    public void subbtnShowMessage(View v) {
        // do something when the button is clicked
        TextView output = findViewById(R.id.hola);
        String appName = getString(R.string.app_name);
        if (output.getText().equals(appName)){
            output.setText("");
        }else {
            output.setText(appName);
        }
    }
}