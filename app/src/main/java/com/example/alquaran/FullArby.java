package com.example.alquaran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.github.barteksc.pdfviewer.PDFView;

public class FullArby extends AppCompatActivity {
    private PDFView quaran;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_arby);
        quaran= findViewById(R.id.pdf_quaran_full);
        quaran.fromAsset("arby.pdf").load();
        ImageView b = findViewById(R.id.imageView_back4);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FullArby.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}