package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class sorathtara extends AppCompatActivity {
    PDFView pdf25;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorathtara);
        pdf25=findViewById(R.id.pdf25);
        pdf25.fromAsset("pani.pdf").load();
    }
}