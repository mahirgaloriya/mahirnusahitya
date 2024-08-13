package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class sorthisanto extends AppCompatActivity {
    PDFView pdf28;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorthisanto);
        pdf28=findViewById(R.id.pdf28);
        pdf28.fromAsset("sant.pdf").load();
    }
}