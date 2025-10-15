package com.example.project_gk_ntdp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button btnDK;
    private EditText edthoten2331, edtuser2331, edtpass2331;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        edthoten2331 = findViewById(R.id.hoten);
        Intent intenDK = new Intent(MainActivity.this,screen_2.class);
        startActivity(intenDK);
    }
}