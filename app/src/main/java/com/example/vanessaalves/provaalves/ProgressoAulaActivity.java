package com.example.vanessaalves.provaalves;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ProgressoAulaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progresso_aula);

        @Override
        botaoMudarTela.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent trocadorTela = new Intent(PrincipalActivity.this, SegundaTelaActivity.class);
                startActivity(trocadorTela);

            }
    }
}
