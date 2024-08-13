package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class hariras extends AppCompatActivity {
    PDFView pdf103;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hariras);
        pdf103=findViewById(R.id.pdf103);
        pdf103.fromAsset("hariras.pdf").load();
    }
}