package com.example.project_cooci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class activity_pengaturan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengaturan);
        ImageButton btna = (ImageButton) findViewById(R.id.btn_b1);
        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l = new Intent(activity_pengaturan.this, home_screen.class);
                startActivity(l);

            }
        });

        ImageButton btnb = (ImageButton) findViewById(R.id.btn_b2);
        btnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l = new Intent(activity_pengaturan.this, profile.class);
                startActivity(l);

            }
        });

        ImageButton btnc = (ImageButton) findViewById(R.id.btn_b3);
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l = new Intent(activity_pengaturan.this, rules.class);
                startActivity(l);

            }
        });

        ImageButton btnd = (ImageButton) findViewById(R.id.btn_b4);
        btnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l = new Intent(activity_pengaturan.this, tentang.class);
                startActivity(l);

            }
        });

        ImageButton btne = (ImageButton) findViewById(R.id.btn_b5);
        btne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l = new Intent(activity_pengaturan.this, login_screen.class);
                startActivity(l);

            }
        });

        ImageButton btnf = (ImageButton) findViewById(R.id.btn_home);
        btnf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n = new Intent(activity_pengaturan.this, home_screen.class);
                startActivity(n);
            }
        });

        ImageButton btng = (ImageButton) findViewById(R.id.btn_history);
        btng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent(activity_pengaturan.this, riwayat_layanan.class);
                startActivity(k);
            }
        });

        ImageButton btnh = (ImageButton) findViewById(R.id.btn_setting);
        btnh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o = new Intent(activity_pengaturan.this, activity_pengaturan.class);
                startActivity(o);
            }
        });
    }
}