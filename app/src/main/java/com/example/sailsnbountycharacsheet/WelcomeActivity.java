package com.example.sailsnbountycharacsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Button btnSf = findViewById(R.id.btnSf);
        Button btnCla = findViewById(R.id.btnCla);

        btnSf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSf = new Intent(WelcomeActivity.this, CharactSheetSF.class);
                startActivity(intentSf);
                finish();
            }
        });

        btnCla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCla = new Intent(WelcomeActivity.this, CharactSheetClassic.class);
                startActivity(intentCla);
                finish();
            }
        });

    }
}
