package com.example.codereviewtest.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.codereviewtest.R;

public class OptionSettingFragment extends Fragment {
    private int mIndex;
    public OptionSettingFragment(){}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        mIndex = getArguments().getInt("index");
        View view;
        switch (mIndex){
            case 0:
                view = inflater.inflate(R.layout.fragment_internet_devices, container, false);
                break;
            case 1:
                view = inflater.inflate(R.layout.fragment_screen_brightness, container, false);
                break;
            case 2:
                view = inflater.inflate(R.layout.fragment_volume_ringtone, container, false);
                break;

            case 3:
                view = inflater.inflate(R.layout.fragment_home_screen, container, false);
                break;

            case 4:
                view = inflater.inflate(R.layout.fragment_customize_phone, container, false);
                break;

            case 5:
                view = inflater.inflate(R.layout.fragment_android_settings, container, false);
                break;

            default:
                view = inflater.inflate(R.layout.fragment_internet_devices, container, false);
                break;
        }

        return view;
    }

}
