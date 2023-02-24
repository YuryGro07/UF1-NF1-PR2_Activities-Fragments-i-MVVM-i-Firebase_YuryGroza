package com.example.uf1_nf1_pr2_activities_fragments_i_mvvm_i_firebase_yurygroza;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ItemModelView extends ViewModel {
    private static final MutableLiveData<String> dadesLiveData = new MutableLiveData<>();

    // Definir un set i un get de l'atribut

    public void setDadesLiveData(String item){
        dadesLiveData.setValue(item);
    }

    public LiveData<String> getDadesLiveData(){
        return dadesLiveData;
    }

}
