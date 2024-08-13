package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class aadesh extends AppCompatActivity {
    PDFView pdfView13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aadesh);
        pdfView13=findViewById(R.id.pdfView13);
        pdfView13.fromAsset("adesh.pdf").load();
    }
}