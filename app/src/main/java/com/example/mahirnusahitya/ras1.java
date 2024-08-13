package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ras1 extends AppCompatActivity {
    PDFView pdf35;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ras1);
        pdf35=findViewById(R.id.pdf35);
        pdf35.fromAsset("rasadhar1.pdf").load();
    }
}