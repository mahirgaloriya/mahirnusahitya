package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class vevishal extends AppCompatActivity {
    PDFView pdf30;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vevishal);
        pdf30=findViewById(R.id.pdf30);
        pdf30.fromAsset("vevishal.pdf").load();
    }
}