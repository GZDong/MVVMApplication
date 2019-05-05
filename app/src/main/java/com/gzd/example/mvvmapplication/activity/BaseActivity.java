package com.gzd.example.mvvmapplication.activity;

import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by gzd on 2019/4/1 0001
 */
public abstract class BaseActivity<M,VM extends ViewDataBinding> extends AppCompatActivity {
    protected VM binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bindViewModel();
    }

    protected abstract int getResId();
    protected abstract void getViewModel(int resId);
    protected abstract M getModel();

    protected void bindViewModel(){

    }
}
