package com.gzd.example.mvvmapplication.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gzd.example.mvvmapplication.R;

public class TemplateActivity extends AppCompatActivity {

    private String mFName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template);
        mFName = getIntent().getStringExtra("fName");

    }
}
