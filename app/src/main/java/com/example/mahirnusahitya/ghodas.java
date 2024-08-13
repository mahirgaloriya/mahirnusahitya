package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ghodas extends AppCompatActivity {
    PDFView pdfView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ghodas);
        pdfView4=findViewById(R.id.pdfView4);
        pdfView4.fromAsset("ghoda.pdf").load();
    }
}