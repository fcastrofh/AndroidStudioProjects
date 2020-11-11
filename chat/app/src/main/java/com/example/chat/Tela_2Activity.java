package com.example.chat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Tela_2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String mensagemRecebida = getIntent().getStringExtra(Tela_1Activity.KEY_INTENT_TELA1);

        TextView tvMessage = findViewById(R.id.tv_recibida2);
        tvMessage.setText(mensagemRecebida);

        final EditText ed_mensagem2 = findViewById(R.id.ed_mensagem2);
        Button button = findViewById(R.id.bt_enviar2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent returnIntent = new Intent(Tela_2Activity.this, Tela_2Activity.class);

                String texto = ed_mensagem2.getText().toString();
                returnIntent.putExtra("result",texto);
                setResult(1100,returnIntent);
                finish();

            }
        });
    }
}