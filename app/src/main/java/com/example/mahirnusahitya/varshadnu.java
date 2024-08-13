package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class varshadnu extends AppCompatActivity {
    PDFView pdfView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_varshadnu);
        pdfView5=findViewById(R.id.pdfView5);
        pdfView5.fromAsset("vashad.pdf").load();
    }
}