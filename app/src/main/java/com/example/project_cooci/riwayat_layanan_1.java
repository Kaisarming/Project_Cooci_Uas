package com.example.project_cooci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class riwayat_layanan_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riwayat_layanan1);
        ImageButton btna = (ImageButton) findViewById(R.id.btn_b1);
        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l = new Intent(riwayat_layanan_1.this, home_screen.class);
                startActivity(l);

            }
        });

        ImageButton btnb = (ImageButton) findViewById(R.id.btn_b2);
        btnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l = new Intent(riwayat_layanan_1.this, activity_detail_pesanan.class);
                startActivity(l);

            }
        });

        ImageButton btnf = (ImageButton) findViewById(R.id.btn_home);
        btnf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n = new Intent(riwayat_layanan_1.this, home_screen.class);
                startActivity(n);
            }
        });

        ImageButton btng = (ImageButton) findViewById(R.id.btn_history);
        btng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent(riwayat_layanan_1.this, riwayat_layanan.class);
                startActivity(k);
            }
        });

        ImageButton btnh = (ImageButton) findViewById(R.id.btn_setting);
        btnh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o = new Intent(riwayat_layanan_1.this, activity_pengaturan.class);
                startActivity(o);
            }
        });
    }
}