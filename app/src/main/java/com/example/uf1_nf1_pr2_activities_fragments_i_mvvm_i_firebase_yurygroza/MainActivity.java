package com.example.uf1_nf1_pr2_activities_fragments_i_mvvm_i_firebase_yurygroza;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button mBtnActivity1, mBtnFragment1, mBtnFragment2;
    private ItemModelView mItemModelView;
    private TextView mTvDadesCompartides;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnActivity1 = findViewById(R.id.BTN_ObrirActivity1);
        mBtnFragment1 = findViewById(R.id.BTN_ObrirFragment1);
        mBtnFragment2 = findViewById(R.id.BTN_ObrirFragment2);

        Intent intent = new Intent(this, Activitat1.class);
        mItemModelView = new ViewModelProvider(this).get(ItemModelView.class);
        mTvDadesCompartides = findViewById(R.id.TV_DadesCompartides);
        mItemModelView.getDadesLiveData().observe(this, itemObservat -> {
            mTvDadesCompartides.setText(itemObservat);
        });
        CarregaFragment(new Fragment1());

        mBtnFragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CarregaFragment(new Fragment1());

            }
        });

        mBtnFragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CarregaFragment(new Fragment2());
            }
        });

        mBtnActivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(intent);
            }

        });
    }
    private void CarregaFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.FL_Fragment, fragment).commit();
    }
}