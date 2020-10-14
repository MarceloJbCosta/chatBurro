package com.example.marcelochatburro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;

public class Tela1 extends AppCompatActivity {

    private EditText edEntradaText;
    private String msg;
    private String msg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botao = findViewById(R.id.btSend);
        TextView tvMensagem = findViewById(R.id.mensagem);
        edEntradaText = findViewById(R.id.entradaTexto);


        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                msg = msg2 + "\n" + edEntradaText.getText().toString();//primeira meensagem

                Intent intent = new Intent(Tela1.this, Tela2.class);
                intent.putExtra("KEY_MSG", msg);
                startActivity(intent);


            }
        });

        msg2 = getIntent().getStringExtra("KEY_MSG2");
        tvMensagem.setText(msg2);




    }
}