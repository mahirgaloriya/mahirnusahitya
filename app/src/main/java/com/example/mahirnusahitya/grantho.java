package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class grantho extends AppCompatActivity {
    Button button18;
    Button button19;
    Button button20;
    Button button21;
    Button button22;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grantho);
        button18=findViewById(R.id.button18);
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(grantho.this,sau1.class);
                startActivity(intent);
            }
        });
        button19=findViewById(R.id.button19);
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(grantho.this,sau2.class);
                startActivity(intent);
            }
        });
        button20=findViewById(R.id.button20);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(grantho.this,sau3.class);
                startActivity(intent);
            }
        });
        button21=findViewById(R.id.button21);
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(grantho.this,sau4.class);
                startActivity(intent);
            }
        });
        button22=findViewById(R.id.button22);
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(grantho.this,sau5.class);
                startActivity(intent);
            }
        });
    }
}