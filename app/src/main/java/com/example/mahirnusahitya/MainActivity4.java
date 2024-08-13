package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {
    Button button23;
    Button button24;
    Button button28;
    Button button29;
    Button button30;
    Button button31;
    Button button32;
    Button button33;
    Button button34;
    Button button35;
    Button button36;
    Button button37;
    Button button39;
    Button button42;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        button42=findViewById(R.id.button42);
        button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity4.this,raat.class);
                startActivity(intent);
            }
        });

        button24=findViewById(R.id.button24);
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity4.this,sorthi.class);
                startActivity(intent);
            }
        });
        button23=findViewById(R.id.button23);
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity4.this,grantho.class);
                startActivity(intent);
            }
        });

        button28=findViewById(R.id.button28);
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity4.this,sorathtara.class);
                startActivity(intent);
            }
        });

        button29=findViewById(R.id.button29);
        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity4.this,kander.class);
                startActivity(intent);
            }
        });
        button30=findViewById(R.id.button30);
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity4.this,sorthiyaduha.class);
                startActivity(intent);
            }
        });
        button31=findViewById(R.id.button31);
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity4.this,sorthisanto.class);
                startActivity(intent);
            }
        });
        button32=findViewById(R.id.button32);
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity4.this,shradhha.class);
                startActivity(intent);
            }
        });
        button33=findViewById(R.id.button33);
        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity4.this,vevishal.class);
                startActivity(intent);
            }
        });
        button34=findViewById(R.id.button34);
        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity4.this,shahjahan.class);
                startActivity(intent);
            }
        });
        button35=findViewById(R.id.button35);
        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity4.this,veni.class);
                startActivity(intent);
            }
        });
        button36=findViewById(R.id.button36);
        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity4.this,lalkillo.class);
                startActivity(intent);
            }
        });
        button37=findViewById(R.id.button37);
        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity4.this,raa.class);
                startActivity(intent);
            }
        });
        button39=findViewById(R.id.button39);
        button39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity4.this,rasadhar.class);
                startActivity(intent);
            }
        });
    }
}