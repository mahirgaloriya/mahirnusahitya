package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class kander extends AppCompatActivity {
    PDFView pdf26;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kander);
        pdf26=findViewById(R.id.pdf26);
        pdf26.fromAsset("khaderma.pdf").load();
    }
}