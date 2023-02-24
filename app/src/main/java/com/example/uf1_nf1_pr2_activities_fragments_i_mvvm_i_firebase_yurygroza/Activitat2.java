package com.example.uf1_nf1_pr2_activities_fragments_i_mvvm_i_firebase_yurygroza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Activitat2 extends AppCompatActivity {

    private TextView mTVRebreDades;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitat2);

        mTVRebreDades = findViewById(R.id.TV_RebreDadesActivity1);
        Intent intent = getIntent();
        mTVRebreDades.setText(intent.getStringExtra("Activitat1"));
    }
}