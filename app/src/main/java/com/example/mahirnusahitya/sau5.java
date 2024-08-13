package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class sau5 extends AppCompatActivity {
    PDFView pdf21;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sau5);
        pdf21=findViewById(R.id.pdf21);
        pdf21.fromAsset("saura5.pdf").load();
    }
}