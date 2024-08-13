package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class chamunda extends AppCompatActivity {
    PDFView pdf49;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chamunda);
        pdf49=findViewById(R.id.pdf49);
        pdf49.fromAsset("chamund.pdf").load();
    }
}