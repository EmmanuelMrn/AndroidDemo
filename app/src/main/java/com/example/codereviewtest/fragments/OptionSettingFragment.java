package com.example.codereviewtest.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.codereviewtest.R;

public class OptionSettingFragment extends Fragment {
    public static final String INDEX = "index";
    public static final int INTERNET_DEVICES = 0;
    public static final int SCREEN_BRIGHTNESS = 1;
    public static final int VOLUME_RINGTONE = 2;
    public static final int HOME_SCREEN = 3;
    public static final int CUSTOMIZE_PHONE = 4;
    public static final int ANDROID_SETTINGS = 5;
    private int mIndex;

    /**
     *This method is used for create the instance of the fragment
     *
     * @param index: This parameter catch the index for choose which fragment layout appears,
     *             inside the method, we send the index as a paramenter through the bundle to fragment
     *
     * @return fragment: This method returns the fragment with the correct fragment layout corresponding to the index.
     */
    public static OptionSettingFragment newInstance(int index){
        OptionSettingFragment fragment = new OptionSettingFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(INDEX, index);
        fragment.setArguments(bundle);

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        Bundle bundle = getArguments();
        if(bundle != null) {
            mIndex = getArguments().containsKey(INDEX) ? getArguments().getInt(INDEX) : 0;
        }
        View view;
        switch (mIndex){
            case INTERNET_DEVICES:
                view = inflater.inflate(R.layout.fragment_internet_devices, container, false);
                break;
            case SCREEN_BRIGHTNESS:
                view = inflater.inflate(R.layout.fragment_screen_brightness, container, false);
                break;
            case VOLUME_RINGTONE:
                view = inflater.inflate(R.layout.fragment_volume_ringtone, container, false);
                break;

            case HOME_SCREEN:
                view = inflater.inflate(R.layout.fragment_home_screen, container, false);
                break;

            case CUSTOMIZE_PHONE:
                view = inflater.inflate(R.layout.fragment_customize_phone, container, false);
                break;

            case ANDROID_SETTINGS:
                view = inflater.inflate(R.layout.fragment_android_settings, container, false);
                break;

            default:
                view = inflater.inflate(R.layout.fragment_internet_devices, container, false);
                break;
        }
        return view;
    }

}
