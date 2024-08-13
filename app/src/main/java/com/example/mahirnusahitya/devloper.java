package com.example.mahirnusahitya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class devloper extends AppCompatActivity {
    ImageView inst;
    ImageView youtube;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devloper);
        inst=findViewById(R.id.inst);
        youtube=findViewById(R.id.youtube);

        inst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gotoUrl("https://instagram.com/mahir_galoriya_official?igshid=MWM2YjBjM2Q=");

            }
        });
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gotoUrl("https://www.youtube.com/channel/UCzUYsGg4SzNBNdEaVO3dmqw");

            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}