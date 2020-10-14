package com.example.marcelochatburro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Tela2 extends AppCompatActivity {

    private EditText edEntradaText2;
    private String msg_Volta;
    private String msg2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        Button botao2 = findViewById(R.id.btSend2);

        TextView tvMensagem2= findViewById(R.id.mensagem2);

        String msg = getIntent().getStringExtra("KEY_MSG");

        edEntradaText2 = findViewById(R.id.entradaTexto2);

        tvMensagem2.setText(msg);

        botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 msg2 = msg_Volta + "\n" + edEntradaText2.getText().toString();

                Intent intent2 = new Intent(Tela2.this, Tela1.class);
                intent2.putExtra("KEY_MSG2", msg2);

                startActivity(intent2);
            }
        });

        msg_Volta = getIntent().getStringExtra("KEY_MSG");
        tvMensagem2.setText(msg_Volta);


    }
}