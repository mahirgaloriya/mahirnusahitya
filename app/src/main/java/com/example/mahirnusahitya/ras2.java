package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ras2 extends AppCompatActivity {
    PDFView pdf36;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ras2);
        pdf36=findViewById(R.id.pdf36);
        pdf36.fromAsset("rashadhar2.pdf").load();
    }
}