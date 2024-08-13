package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class manmor extends AppCompatActivity {
    PDFView pdf44;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manmor);
        pdf44=findViewById(R.id.pdf44);
        pdf44.fromAsset("mor.pdf").load();
    }
}