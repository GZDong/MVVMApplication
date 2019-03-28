package com.gzd.example.mvvmapplication.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.gzd.example.mvvmapplication.R;
import com.gzd.example.mvvmapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        mBinding.setUser(new MainModel("john",25,"http://img2.cache.netease.com/auto/2016/7/28/201607282215432cd8a.jpg"));  //model  ->  view

    }

    public void onItemClick(View view) {
        Log.e("tag", "onItemClick: " + "HEHE" );
        Toast.makeText(view.getContext(), "okokok", Toast.LENGTH_SHORT).show();
    }
}
