package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class mogal extends AppCompatActivity {
    PDFView pdfView15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mogal);
        pdfView15=findViewById(R.id.pdfView15);
        pdfView15.fromAsset("maamogal.pdf").load();
    }
}