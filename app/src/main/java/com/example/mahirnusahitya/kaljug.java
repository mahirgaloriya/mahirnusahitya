package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class kaljug extends AppCompatActivity {
    PDFView pdf39;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kaljug);
        pdf39=findViewById(R.id.pdf39);
        pdf39.fromAsset("kaan.pdf").load();
    }
}