package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class sorthiyaduha extends AppCompatActivity {
    PDFView pdf27;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorthiyaduha);
        pdf27=findViewById(R.id.pdf27);
        pdf27.fromAsset("duha.pdf").load();
    }
}