package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class sau3 extends AppCompatActivity {
    PDFView pdf19;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sau3);
        pdf19=findViewById(R.id.pdf19);
        pdf19.fromAsset("saura3.pdf").load();
    }
}