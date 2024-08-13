package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class kag1 extends AppCompatActivity {
    PDFView pdf100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kag1);
        pdf100=findViewById(R.id.pdf100);
        pdf100.fromAsset("kagvani1.pdf").load();
    }
}