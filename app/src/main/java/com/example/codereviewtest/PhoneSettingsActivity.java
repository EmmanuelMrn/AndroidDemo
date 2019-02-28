package com.example.codereviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.example.codereviewtest.adapters.PhoneSettingsAdapter;

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

    List<String> dataListSettingsOptions;
    private RecyclerView mSettingsOptionsRecyclerView;
    private RecyclerView.Adapter mSettingsOptionsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_settings);

        mSettingsOptionsRecyclerView = findViewById(R.id.recycle_view_list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayout.VERTICAL, false);
        mSettingsOptionsRecyclerView.setLayoutManager(linearLayoutManager);

        dataListSettingsOptions = new ArrayList<>();

        for(int index = 0; index< sOptionsLabels.length ; index++){
            dataListSettingsOptions.add(sOptionsLabels[index]);
        }

        mSettingsOptionsAdapter = new PhoneSettingsAdapter(this, dataListSettingsOptions);
        mSettingsOptionsRecyclerView.setAdapter(mSettingsOptionsAdapter);
    }
}
