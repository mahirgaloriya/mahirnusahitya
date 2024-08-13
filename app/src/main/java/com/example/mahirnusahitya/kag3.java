package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class kag3 extends AppCompatActivity {
    PDFView pdf102;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kag3);
        pdf102=findViewById(R.id.pdf102);
        pdf102.fromAsset("kagvani3.pdf").load();
    }
}