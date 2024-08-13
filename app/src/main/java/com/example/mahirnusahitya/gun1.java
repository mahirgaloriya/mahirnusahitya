package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class gun1 extends AppCompatActivity {
    PDFView pdfView10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gun1);
        pdfView10=findViewById(R.id.pdfView10);
        pdfView10.fromAsset("gun.pdf").load();
    }
}