package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class marad extends AppCompatActivity {
    PDFView pdf42;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marad);
        pdf42=findViewById(R.id.pdf42);
        pdf42.fromAsset("mard.pdf").load();
    }
}