package com.example.alquaran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.github.barteksc.pdfviewer.PDFView;

public class BN_AR extends AppCompatActivity {
 private   PDFView quaran;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        quaran= findViewById(R.id.pdf_quaran_bn);
        quaran.fromAsset("bn_ar.pdf").load();
        ImageView b = findViewById(R.id.imageView_back9);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BN_AR.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}