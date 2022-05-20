package com.example.project_cooci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class booking_screen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_screen2);
        ImageButton btnl = (ImageButton) findViewById(R.id.btn_back3);
        btnl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l = new Intent(booking_screen2.this, booking_screen.class);
                startActivity(l);
            }
        });
        Button btnm = (Button) findViewById(R.id.btn_pesan);
        btnm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(booking_screen2.this, payment_activity.class);
                startActivity(m);
            }
        });
    }
}