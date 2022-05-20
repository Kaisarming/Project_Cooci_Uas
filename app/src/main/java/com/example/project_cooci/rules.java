package com.example.project_cooci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class rules extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);
        ImageButton btna = (ImageButton) findViewById(R.id.btn_b1);
        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l = new Intent(rules.this, activity_pengaturan.class);
                startActivity(l);

            }
        });

        Button btn2 = (Button) findViewById(R.id.btn_setuju);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l = new Intent(rules.this, home_screen.class);
                startActivity(l);

            }
        });
    }
}