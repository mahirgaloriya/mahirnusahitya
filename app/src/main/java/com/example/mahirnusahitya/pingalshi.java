package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pingalshi extends AppCompatActivity {
    PDFView pdf105;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pingalshi);
        pdf105=findViewById(R.id.pdf105);
        pdf105.fromAsset("pingal.pdf").load();
    }
}