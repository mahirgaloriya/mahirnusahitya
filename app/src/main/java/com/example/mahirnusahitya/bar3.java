package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class bar3 extends AppCompatActivity {
    PDFView pdfView102;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar3);
        PDFView pdfView102;

        pdfView102=findViewById(R.id.pdfView102);
        pdfView102.fromAsset("baravat3.pdf").load();
    }
}