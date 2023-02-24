package com.example.uf1_nf1_pr2_activities_fragments_i_mvvm_i_firebase_yurygroza;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Fragment1 extends Fragment {


    private EditText mEtDades;
    private Button mBtnDades;
    private ItemModelView mItemModelView;

    public Fragment1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_1, container, false);
        mEtDades = v.findViewById(R.id.ET_DadesFL);
        mBtnDades = v.findViewById(R.id.BTN_EnviarDadesCompartidesFL1);
        mItemModelView = new ViewModelProvider(this).get(ItemModelView.class);

        mItemModelView.getDadesLiveData().observe(getViewLifecycleOwner(), itemObservat -> {
            mEtDades.setText(mItemModelView.getDadesLiveData().getValue());
        });
        mBtnDades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dadesCompartides = mEtDades.getText().toString();
                mItemModelView.setDadesLiveData(dadesCompartides);

            }
        });

        return v;
    }
}