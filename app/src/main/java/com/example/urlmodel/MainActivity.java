package com.example.urlmodel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    static EditText Url;
    static Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Url = (EditText) findViewById(R.id.URL);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String urlInput = Url.getText().toString().trim();
                if (!urlInput.isEmpty()) {
                    Intent intent = new Intent(MainActivity.this, PageActivity.class);
                    intent.putExtra("url",urlInput);
                    startActivity(intent);
                }
            }
        });
    }

}
