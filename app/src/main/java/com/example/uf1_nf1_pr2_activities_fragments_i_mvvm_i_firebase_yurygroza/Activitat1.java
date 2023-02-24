package com.example.uf1_nf1_pr2_activities_fragments_i_mvvm_i_firebase_yurygroza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activitat1 extends AppCompatActivity {
    private Button mBtnEnviarDades;
    private EditText mEtDades;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitat1);

        mBtnEnviarDades = findViewById(R.id.BTN_EnviarDadesActivity1);
        mEtDades = findViewById(R.id.ET_Dades);

        Intent intent = new Intent(this, Activitat2.class);

        mBtnEnviarDades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("Activitat1", mEtDades.getText().toString());
                startActivity(intent);
            }

        });
    }
}