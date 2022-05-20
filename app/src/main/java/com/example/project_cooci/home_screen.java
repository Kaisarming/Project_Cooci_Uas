package com.example.project_cooci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class home_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        ImageButton btnl = (ImageButton) findViewById(R.id.btn_mobil);
        btnl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l = new Intent(home_screen.this, booking_screen.class);
                startActivity(l);

            }
        });
        ImageButton btnm = (ImageButton) findViewById(R.id.btn_motorcycle);
        btnm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(home_screen.this, booking_screen.class);
                startActivity(m);
            }
        });
        ImageButton btnn = (ImageButton) findViewById(R.id.btn_home);
        btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n = new Intent(home_screen.this, booking_screen2.class);
                startActivity(n);
            }
        });

        ImageButton btnk = (ImageButton) findViewById(R.id.btn_history);
        btnk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent(home_screen.this, riwayat_layanan.class);
                startActivity(k);
            }
        });

        ImageButton btno = (ImageButton) findViewById(R.id.btn_setting);
        btno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o = new Intent(home_screen.this, activity_pengaturan.class);
                startActivity(o);
            }
        });
    }
}