package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class katarinukirtan extends AppCompatActivity {
    PDFView pdfView7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_katarinukirtan);
        pdfView7=findViewById(R.id.pdfView7);
        pdfView7.fromAsset("katari.pdf").load();
    }
}