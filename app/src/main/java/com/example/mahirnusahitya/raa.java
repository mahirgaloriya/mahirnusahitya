package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class raa extends AppCompatActivity {
    PDFView pdf34;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raa);
        pdf34=findViewById(R.id.pdf34);
        pdf34.fromAsset("raagang.pdf").load();
    }
}