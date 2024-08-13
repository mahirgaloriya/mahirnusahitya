package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class shahjahan extends AppCompatActivity {
    PDFView pdf31;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shahjahan);
        pdf31=findViewById(R.id.pdf31);
        pdf31.fromAsset("shah.pdf").load();
    }
}