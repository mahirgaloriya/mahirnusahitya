package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class charani extends AppCompatActivity {
    PDFView pdfView14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charani);
        pdfView14=findViewById(R.id.pdfView14);
        pdfView14.fromAsset("kasumbo.pdf").load();

    }
}