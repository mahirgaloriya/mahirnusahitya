package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ramavalanorahado extends AppCompatActivity {
    PDFView pdf48;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ramavalanorahado);
        pdf48=findViewById(R.id.pdf48);
        pdf48.fromAsset("raamvalo.pdf").load();
    }
}