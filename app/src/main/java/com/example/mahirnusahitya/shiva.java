package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class shiva extends AppCompatActivity {
    PDFView pdf47;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shiva);
        pdf47=findViewById(R.id.pdf47);
        pdf47.fromAsset("shivay.pdf").load();
    }
}