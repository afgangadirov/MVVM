package com.example.mvvmkulllanimi;

import androidx.lifecycle.MutableLiveData;

public class RiyaziyyatRepository {

    private MutableLiveData<String> riyaziNetice;

    public RiyaziyyatRepository() {

        riyaziNetice = new MutableLiveData<String>("0");
    }

    public MutableLiveData<String> getRiyaziNetice() {
        return riyaziNetice;
    }

    public void topla(String alinanEded1, String alinanEded2){

        int eded1 = Integer.parseInt(alinanEded1);
        int eded2 = Integer.parseInt(alinanEded2);

        int cem = eded1 + eded2;

        riyaziNetice.setValue(String.valueOf(cem));
    }

    public void vur(String alinanEded1, String alinanEded2){

        int eded1 = Integer.parseInt(alinanEded1);
        int eded2 = Integer.parseInt(alinanEded2);

        int hasil = eded1 * eded2;

        riyaziNetice.setValue(String.valueOf(hasil));

    }

}
