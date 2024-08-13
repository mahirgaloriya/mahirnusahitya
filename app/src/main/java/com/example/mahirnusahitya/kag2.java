package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class kag2 extends AppCompatActivity {
    PDFView pdf101;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kag2);
        pdf101=findViewById(R.id.pdf101);
        pdf101.fromAsset("kagvani2.pdf").load();
    }
}