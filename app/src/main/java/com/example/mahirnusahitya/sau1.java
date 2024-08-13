package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class sau1 extends AppCompatActivity {
    PDFView pdf17;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sau1);
        pdf17=findViewById(R.id.pdf17);
        pdf17.fromAsset("saura1.pdf").load();
    }
}