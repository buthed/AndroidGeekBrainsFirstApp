package com.tematikhonov.androidgeekbrainsfirstapp;

import android.app.UiModeManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.SwitchCompat;

public class MenuActivity extends AppCompatActivity {

    private UiModeManager uiModeManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        uiModeManager = (UiModeManager) getSystemService(UI_MODE_SERVICE);
        initView();
    }

    private void initView() {
        Button buttonStart = findViewById(R.id.button_start);
        SwitchCompat switchMode = findViewById(R.id.switchMode);

        switchMode.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                } else {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                }
            }
        });

        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, MainActivity.class);

                startActivity(intent);
            }
        });
    }

//    private void NightModeOn(View view) {
//        uiModeManager.setNightMode(UiModeManager.MODE_NIGHT_YES);
//    }
//
//    private void NightModeOff(View view) {
//        uiModeManager.setNightMode(UiModeManager.MODE_NIGHT_NO);
//    }
}
