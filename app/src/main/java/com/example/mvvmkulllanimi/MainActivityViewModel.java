package com.example.mvvmkulllanimi;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {

    private MutableLiveData<String> netice;
    private RiyaziyyatRepository rrepo = new RiyaziyyatRepository();

    public MainActivityViewModel() {

        netice = rrepo.getRiyaziNetice();
    }

    public MutableLiveData<String> getNetice() {
        return netice;
    }

    public void toplamaEt(String alinanEded1, String alinanEded2){
        rrepo.topla(alinanEded1,alinanEded2);
    }

    public void vurmaEt(String alinanEded1, String alinanEded2){
        rrepo.vur(alinanEded1,alinanEded2);
    }


}
