package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sorthi extends AppCompatActivity {
    Button button25;
    Button button26;
    Button button27;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorthi);
       button25=findViewById(R.id.button25);
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(sorthi.this,bar1.class);
                startActivity(intent);
            }
        });

        button26=findViewById(R.id.button26);
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(sorthi.this,bar2.class);
                startActivity(intent);
            }
        });

        button27=findViewById(R.id.button27);
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(sorthi.this,bar3.class);
                startActivity(intent);
            }
        });
    }
}