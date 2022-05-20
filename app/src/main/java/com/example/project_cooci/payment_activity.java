package com.example.project_cooci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class payment_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        ImageButton btna = (ImageButton) findViewById(R.id.btn_b1);
        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l = new Intent(payment_activity.this, booking_screen2.class);
                startActivity(l);

            }
        });

        ImageButton btnb = (ImageButton) findViewById(R.id.btn_b2);
        btnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l = new Intent(payment_activity.this, riwayat_layanan_1.class);
                startActivity(l);

            }
        });
    }
}