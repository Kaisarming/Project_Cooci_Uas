package com.example.project_cooci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class activity_detail_pesanan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pesanan);
        ImageButton btnl = (ImageButton) findViewById(R.id.btn_back6);
        btnl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l = new Intent(activity_detail_pesanan.this, riwayat_layanan_1.class);
                startActivity(l);
            }
        });

        ImageButton btna = (ImageButton) findViewById(R.id.btn_b2);
        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l = new Intent(activity_detail_pesanan.this, chat_customer.class);
                startActivity(l);

            }
        });
    }
}