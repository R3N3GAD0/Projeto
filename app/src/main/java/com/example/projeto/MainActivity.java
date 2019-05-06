package com.example.projeto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int cafebazinga = 0;
    int pre = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void mais(View view){
        TextView textView = findViewById(R.id.texto);
        TextView textView2 = findViewById(R.id.preco);
        cafebazinga = cafebazinga + 1;
        pre = cafebazinga * 3;
        textView.setText("Café: " + cafebazinga);
        textView2.setText("Preço Total: " + pre);

    }

    public void menos(View view) {
        TextView textView = findViewById(R.id.texto);
        TextView textView2 = findViewById(R.id.preco);
        if(cafebazinga != 0) {
            cafebazinga--;
            pre = cafebazinga * 3;
        }
            textView.setText("Café: " + cafebazinga);
            textView2.setText("Preço Total: " + pre);
    }
}
