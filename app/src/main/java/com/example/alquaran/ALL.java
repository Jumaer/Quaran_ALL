package com.example.alquaran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.github.barteksc.pdfviewer.PDFView;

public class ALL extends AppCompatActivity {
    private PDFView quaran;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_l_l);
        quaran= findViewById(R.id.pdf_quaran);
        quaran.fromAsset("qr_all.pdf").load();
        ImageView b = findViewById(R.id.imageView_back);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ALL.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}