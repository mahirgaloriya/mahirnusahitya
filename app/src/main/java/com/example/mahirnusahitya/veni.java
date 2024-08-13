package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class veni extends AppCompatActivity {
    PDFView pdf32;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veni);
        pdf32=findViewById(R.id.pdf32);
        pdf32.fromAsset("veni.pdf").load();
    }
}