package com.android.frasesdodia;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String[] frases = {
            "Frase 01",
            "Frase 02",
            "Frase 03",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void gerarFrase(View view){
        TextView Frase = findViewById(R.id.frase_gerada);
        int number = new Random().nextInt(3);
        String frase = frases[number];
        Frase.setText(frase);
    }

    public void exibirTodas(View view){
        TextView Frase = findViewById(R.id.frase_gerada);
        String texto = "";
        for(String frase : frases){
            texto = texto + frase + "\n";
        }
        Frase.setText(texto);
        System.out.println("ExibirTodas : 200OK ");
    }

}