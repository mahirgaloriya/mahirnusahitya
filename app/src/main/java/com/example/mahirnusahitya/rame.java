package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class rame extends AppCompatActivity {
    PDFView pdf38;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rame);
        pdf38=findViewById(R.id.pdf38);
        pdf38.fromAsset("shyamrame.pdf").load();
    }
}