package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class sau2 extends AppCompatActivity {
    PDFView pdf18;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sau2);
        pdf18=findViewById(R.id.pdf18);
        pdf18.fromAsset("saura2.pdf").load();
    }
}