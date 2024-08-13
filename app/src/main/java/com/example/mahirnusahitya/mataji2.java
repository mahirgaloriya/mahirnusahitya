package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class mataji2 extends AppCompatActivity {
    PDFView pdfView9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mataji2);
        pdfView9=findViewById(R.id.pdfView9);
        pdfView9.fromAsset("mata2.pdf").load();
    }
}