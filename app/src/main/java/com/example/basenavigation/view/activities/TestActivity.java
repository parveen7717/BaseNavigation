package com.example.basenavigation.view.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.basenavigation.R;

public class TestActivity extends BaseActivity {

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        backPress();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_activity);
    }
}
