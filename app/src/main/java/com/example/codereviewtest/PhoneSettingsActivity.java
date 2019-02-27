package com.example.codereviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.example.codereviewtest.adapters.AdapterPhoneSettings;

import java.util.ArrayList;
import java.util.List;

public class PhoneSettingsActivity extends AppCompatActivity {

    private static final String[] sOptionsLabels = {
            "Internet & Devices",
            "Screen Brightness",
            "Volume & Ringtone",
            "Home Screen",
            "Customize Phone",
            "Android Settings"
    };

    List<String> listData;
    private RecyclerView mSettingsOptionsRecyclerView;
    private RecyclerView.Adapter mSettingsOptionsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_settings);

        mSettingsOptionsRecyclerView = findViewById(R.id.recycleViewList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayout.VERTICAL, false);
        mSettingsOptionsRecyclerView.setLayoutManager(linearLayoutManager);

        listData = new ArrayList<>();

        for(int i = 0; i<6 ; i++){
            listData.add(sOptionsLabels[i]);
        }

        mSettingsOptionsAdapter = new AdapterPhoneSettings(this, listData);
        mSettingsOptionsRecyclerView.setAdapter(mSettingsOptionsAdapter);
    }
}
