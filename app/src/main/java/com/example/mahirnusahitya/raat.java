package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class raat extends AppCompatActivity {
    PDFView pdfView37;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raat);
        pdfView37=findViewById(R.id.pdf37);
        pdfView37.fromAsset("radhiya.pdf").load();
    }
}