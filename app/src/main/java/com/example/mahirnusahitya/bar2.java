package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class bar2 extends AppCompatActivity {
    PDFView pdfView101;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar2);
        pdfView101=findViewById(R.id.pdfView101);
        pdfView101.fromAsset("baravat2.pdf").load();
    }
}