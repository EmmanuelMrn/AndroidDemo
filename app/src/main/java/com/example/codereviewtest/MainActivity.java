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

        mPhoneSettingsButton = findViewById(R.id.buttonPhoneSettings);
        mPhoneSettingsButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.buttonPhoneSettings){
            goToPhoneSettings();
        }
    }

    public void goToPhoneSettings() {
        Intent intent = new Intent();
        intent.setClass(this, PhoneSettingsActivity.class);
        startActivity(intent);
        finish();
    }
}
