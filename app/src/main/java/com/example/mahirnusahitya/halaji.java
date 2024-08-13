package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class halaji extends AppCompatActivity {
    PDFView pdf45;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaji);
        pdf45=findViewById(R.id.pdf45);
        pdf45.fromAsset("halaji.pdf").load();
    }
}