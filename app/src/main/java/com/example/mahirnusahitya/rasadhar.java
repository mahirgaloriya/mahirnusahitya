package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class rasadhar extends AppCompatActivity {
    Button button40;
    Button button41;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rasadhar);
        button40=findViewById(R.id.button40);
        button40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(rasadhar.this,ras1.class);
                startActivity(intent);
            }
        });
        button41=findViewById(R.id.button41);
        button41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(rasadhar.this,ras2.class);
                startActivity(intent);
            }
        });
    }
}