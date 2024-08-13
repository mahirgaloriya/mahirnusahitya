package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class gaam extends AppCompatActivity {
    PDFView pdf41;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaam);
        pdf41=findViewById(R.id.pdf41);
        pdf41.fromAsset("gamdu.pdf").load();
    }
}