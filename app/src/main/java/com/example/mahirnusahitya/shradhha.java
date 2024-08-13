package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class shradhha extends AppCompatActivity {
    PDFView pdf29;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shradhha);
        pdf29=findViewById(R.id.pdf29);
        pdf29.fromAsset("satya.pdf").load();
    }
}