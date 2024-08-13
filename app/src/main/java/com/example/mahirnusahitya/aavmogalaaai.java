package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class aavmogalaaai extends AppCompatActivity {
    PDFView pdf40;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aavmogalaaai);
        pdf40=findViewById(R.id.pdf40);
        pdf40.fromAsset("aavmogal.pdf").load();
    }
}