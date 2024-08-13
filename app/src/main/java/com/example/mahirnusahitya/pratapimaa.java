package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pratapimaa extends AppCompatActivity {
    PDFView pdf43;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pratapimaa);
        pdf43=findViewById(R.id.pdf43);
        pdf43.fromAsset("machh.pdf").load();
    }
}