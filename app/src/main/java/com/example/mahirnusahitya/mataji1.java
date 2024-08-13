package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class mataji1 extends AppCompatActivity {
    PDFView pdfView8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mataji1);
        pdfView8=findViewById(R.id.pdfView8);
        pdfView8.fromAsset("mata1.pdf").load();
    }
}