package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class khodal extends AppCompatActivity {
    PDFView pdfView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khodal);
        pdfView2=findViewById(R.id.pdfView2);
        pdfView2.fromAsset("khodiyar.pdf").load();
    }
}