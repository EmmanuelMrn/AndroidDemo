package com.example.codereviewtest;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.example.codereviewtest.fragments.OptionSettingFragment;

public class OptionPhoneSettingActivity extends AppCompatActivity {
    private int mReceiveIndex;

    public OptionPhoneSettingActivity(){ }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_phone_setting);

        Bundle bundle = getIntent().getExtras();
        if(bundle!= null){
            mReceiveIndex = bundle.getInt("index");
            bundle.putInt("index", mReceiveIndex);
        }


        //Step 1: Get the instance of fragment administrator
        FragmentManager fragmentManager = getSupportFragmentManager();

        //Step 2: Create a new transaction
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        //Step 3: Create a new fragment and add it
        OptionSettingFragment fragment = new OptionSettingFragment();
        fragment.setArguments(bundle);
        transaction.add(R.id.fragmentContainer, fragment);

        //Step 4: Confirm
        transaction.commit();
    }
}
