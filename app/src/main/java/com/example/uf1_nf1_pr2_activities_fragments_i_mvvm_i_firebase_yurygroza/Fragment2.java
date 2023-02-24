package com.example.uf1_nf1_pr2_activities_fragments_i_mvvm_i_firebase_yurygroza;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Fragment2 extends Fragment {

    private EditText mEtRebreDades;
    private ItemModelView mItemModelView;
    private Button mBtnEnviarDadesCompartides;

    public Fragment2() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_2, container, false);

        mEtRebreDades = v.findViewById(R.id.ET_DadesFL2);
        mItemModelView = new ViewModelProvider(this).get(ItemModelView.class);
        mBtnEnviarDadesCompartides = v.findViewById(R.id.BTN_EnviarDadesCompartidesFL2);
        mItemModelView.getDadesLiveData().observe(getViewLifecycleOwner(), itemObservat -> {
            mEtRebreDades.setText(mItemModelView.getDadesLiveData().getValue());
        });
        mBtnEnviarDadesCompartides.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dadesCompartides = mEtRebreDades.getText().toString();
                mItemModelView.setDadesLiveData(dadesCompartides);

            }
        });
        return v;

    }
}