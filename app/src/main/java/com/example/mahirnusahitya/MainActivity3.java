package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
    Button button;
    Button button38;
    Button button43;
    Button button56;
    Button button60;
    Button button61;
    Button button62;
    Button button63;
    Button button64;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity3.this,MainActivity4.class);
                startActivity(intent);
            }
        });
        button38=findViewById(R.id.button38);
        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity3.this,MainActivity2.class);
                startActivity(intent);
            }
        });
        button43=findViewById(R.id.button43);
        button43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity3.this,MainActivity5.class);
                startActivity(intent);
            }
        });
        button56=findViewById(R.id.button56);
        button56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity3.this,MainActivity6.class);
                startActivity(intent);
            }
        });
        button60=findViewById(R.id.button60);
        button60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity3.this,hariras.class);
                startActivity(intent);
            }
        });
        button61=findViewById(R.id.button61);
        button61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity3.this,bhajanpothi.class);
                startActivity(intent);
            }
        });
        button62=findViewById(R.id.button62);
        button62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity3.this,pingalshi.class);
                startActivity(intent);
            }
        });
        button63=findViewById(R.id.button63);
        button63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity3.this,jogidan.class);
                startActivity(intent);
            }
        });
        button64=findViewById(R.id.button64);
        button64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity3.this,devloper.class);
                startActivity(intent);
            }
        });
    }
}