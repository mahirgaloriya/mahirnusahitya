package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class maruya extends AppCompatActivity {
    PDFView pdfView11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maruya);
        pdfView11=findViewById(R.id.pdfView11);
        pdfView11.fromAsset("tarif.pdf").load();
    }
}