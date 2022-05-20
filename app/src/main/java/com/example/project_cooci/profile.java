package com.example.project_cooci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ImageButton btna = (ImageButton) findViewById(R.id.btn_b1);
        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l = new Intent(profile.this, activity_pengaturan.class);
                startActivity(l);

            }
        });

        ImageButton btnb = (ImageButton) findViewById(R.id.btn_b1);
        btnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l = new Intent(profile.this, activity_pengaturan.class);
                startActivity(l);

            }
        });
    }
}