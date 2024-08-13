package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class savaj extends AppCompatActivity {
    PDFView pdfView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_savaj);
        pdfView3=findViewById(R.id.pdfView3);
        pdfView3.fromAsset("sih.pdf").load();
    }
}