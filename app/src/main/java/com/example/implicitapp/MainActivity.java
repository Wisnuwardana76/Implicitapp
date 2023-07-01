package com.example.implicitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etNoHp;
    Button btnDialpad, btnContact, btnCamera, btnGaleri, btnBrowser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNoHp = findViewById(R.id.et_nomerhp);
        btnDialpad = findViewById(R.id.btn_dialpad);
        btnContact = findViewById(R.id.btn_contact);
        btnCamera = findViewById(R.id.btn_camera);
        btnGaleri = findViewById(R.id.btn_galeri);
        btnBrowser = findViewById(R.id.btn_browser);

        btnDialpad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etNoHp.getText().toString().isEmpty()) {
                    Intent i = new Intent();
                    i.setAction(Intent.ACTION_DIAL);
                    startActivity(i);
                } else {
                    Intent i = new Intent();
                    i.setAction(Intent.ACTION_DIAL);
                    i.setData(Uri.parse("tel:" +etNoHp.getText().toString()));
                    startActivity(i);
                }
            }
        });

        btnContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnGaleri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnBrowser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}