package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class bhajanpothi extends AppCompatActivity {
    PDFView pdf104;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bhajanpothi);
        pdf104=findViewById(R.id.pdf104);
        pdf104.fromAsset("bhajan.pdf").load();
    }
}