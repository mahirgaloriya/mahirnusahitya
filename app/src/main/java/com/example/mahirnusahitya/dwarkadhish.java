package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class dwarkadhish extends AppCompatActivity {
    PDFView pdfView6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dwarkadhish);
        pdfView6=findViewById(R.id.pdfView6);
        pdfView6.fromAsset("dwarka.pdf").load();
    }
}