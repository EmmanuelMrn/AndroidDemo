package com.example.codereviewtest;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.example.codereviewtest.fragments.OptionSettingFragment;

public class OptionPhoneSettingActivity extends AppCompatActivity {
    public OptionPhoneSettingActivity(){ }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_phone_setting);
        Bundle bundle = getIntent().getExtras();
        if(bundle!= null){
            int indexReceive = bundle.containsKey(OptionSettingFragment.INDEX) ? bundle.getInt(OptionSettingFragment.INDEX) : 0 ;
            showOptionSettingFragment(indexReceive);
        }
    }

    /**
     * This method creates a new fragment manager instance, creates a new fragment transition instance and creates a
     * new fragment instance and adds it to it, it also gives the index that the fragment needs to choose which rendering design.
     *
     * @param indexReceive: This integer is the position of the setting that user touched.
     */
    private void showOptionSettingFragment(int indexReceive){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.fragment_container, OptionSettingFragment.newInstance(indexReceive)).commit();
    }
}
