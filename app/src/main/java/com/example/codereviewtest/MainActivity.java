package com.example.codereviewtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button mPhoneSettingsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPhoneSettingsButton = findViewById(R.id.button_phone_settings);
        mPhoneSettingsButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button_phone_settings){
            goToPhoneSettings();
        }
    }

    /**
     * This method create a new instance of Intent for go to PhoneSettingsActivity
     * and finish the Main activity.
     */
    public void goToPhoneSettings() {
        Intent intent = new Intent();
        intent.setClass(this, PhoneSettingsActivity.class);
        startActivity(intent);
        finish();
    }
}
