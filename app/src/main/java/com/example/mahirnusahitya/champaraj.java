package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.pdf.PdfDocument;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class champaraj extends AppCompatActivity {
    PDFView pdfView12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_champaraj);
        pdfView12=findViewById(R.id.pdfView12);
        pdfView12.fromAsset("champa.pdf").load();
    }
}