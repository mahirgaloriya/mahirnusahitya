package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class someshvar extends AppCompatActivity {
    PDFView pdf46;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_someshvar);
        pdf46=findViewById(R.id.pdf46);
        pdf46.fromAsset("somanath.pdf").load();
    }
}