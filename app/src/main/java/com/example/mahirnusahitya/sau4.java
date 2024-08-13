package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class sau4 extends AppCompatActivity {
    PDFView pdf20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sau4);
        pdf20=findViewById(R.id.pdf20);
        pdf20.fromAsset("saura4.pdf").load();
    }
}