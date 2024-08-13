package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class jogidan extends AppCompatActivity {
    PDFView pdf106;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogidan);
        pdf106=findViewById(R.id.pdf106);
        pdf106.fromAsset("riti.pdf").load();
    }
}