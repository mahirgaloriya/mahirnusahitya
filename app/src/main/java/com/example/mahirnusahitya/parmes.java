package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class parmes extends AppCompatActivity {
    PDFView pdfView16;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parmes);
        pdfView16=findViewById(R.id.pdfView16);
        pdfView16.fromAsset("shambhu.pdf").load();
    }
}