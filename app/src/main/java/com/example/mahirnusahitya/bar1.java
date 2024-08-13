package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class bar1 extends AppCompatActivity {
    PDFView pdfView100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar1);
        pdfView100=findViewById(R.id.pdfView100);
        pdfView100.fromAsset("baravat1.pdf").load();
    }
}