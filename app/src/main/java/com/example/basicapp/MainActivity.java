package com.example.basicapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Boolean flag = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        ImageView img = findViewById(R.id.imageView);

        btn.setOnClickListener(v -> {
            btn.setText("Click Me Again!");
            if (!flag) {
                img.setImageResource(R.drawable.bing);
                flag = true;
            } else {
                img.setImageResource(R.drawable.wp3087307);
                flag = false;
            }
        });
    }
}