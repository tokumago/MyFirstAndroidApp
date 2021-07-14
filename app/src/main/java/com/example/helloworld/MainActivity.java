package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.btnChangeLang);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Locale locale = new Locale("fr_FR");
                Locale.setDefault(locale);
                Configuration config = new Configuration();
                config.setLocale(locale);
            }
        });
    }
}