package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class lalkillo extends AppCompatActivity {
    PDFView pdf33;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lalkillo);
        pdf33=findViewById(R.id.pdf33);
        pdf33.fromAsset("lal.pdf").load();
    }
}