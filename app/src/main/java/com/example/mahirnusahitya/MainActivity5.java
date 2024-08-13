package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {
    Button button44;
    Button button45;
    Button button46;
    Button button47;
    Button button48;
    Button button49;
    Button button50;
    Button button51;
    Button button52;
    Button button53;
    Button button54;
    Button button55;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        button55=findViewById(R.id.button55);
        button55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity5.this,chamunda.class);
                startActivity(intent);
            }
        });
        button54=findViewById(R.id.button54);
        button54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity5.this,ramavalanorahado.class);
                startActivity(intent);
            }
        });
        button53=findViewById(R.id.button53);
        button53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity5.this,shiva.class);
                startActivity(intent);
            }
        });
        button52=findViewById(R.id.button52);
        button52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity5.this,someshvar.class);
                startActivity(intent);
            }
        });
        button51=findViewById(R.id.button51);
        button51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity5.this,halaji.class);
                startActivity(intent);
            }
        });
        button50=findViewById(R.id.button50);
        button50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity5.this,manmor.class);
                startActivity(intent);
            }
        });
        button44=findViewById(R.id.button44);
        button44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity5.this,rame.class);
                startActivity(intent);
            }
        });
        button45=findViewById(R.id.button45);
        button45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity5.this,kaljug.class);
                startActivity(intent);
            }
        });
        button46=findViewById(R.id.button46);
        button46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity5.this,aavmogalaaai.class);
                startActivity(intent);
            }
        });
        button47=findViewById(R.id.button47);
        button47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity5.this,gaam.class);
                startActivity(intent);
            }
        });
        button48=findViewById(R.id.button48);
        button48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity5.this,marad.class);
                startActivity(intent);
            }
        });
        button49=findViewById(R.id.button49);
        button49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity5.this,pratapimaa.class);
                startActivity(intent);
            }
        });
    }
}