package com.example.mvvmkulllanimi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mvvmkulllanimi.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;

    private MainActivityViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        viewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);

        activityMainBinding.setMainActivityObject(this);

        viewModel.getNetice().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                activityMainBinding.setHesablamaNeticesi(s);
            }
        });


    }

    public void buttonToplamaTikla(String alinanEded1, String alinanEded2){
        viewModel.toplamaEt(alinanEded1,alinanEded2);

    }

    public void buttonVurmaTikla(String alinanEded1, String alinanEded2){
        viewModel.vurmaEt(alinanEded1,alinanEded2);

    }





}