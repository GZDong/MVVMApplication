package com.gzd.example.mvvmapplication.fragment;

import android.content.Context;
import android.content.Intent;

import com.gzd.example.mvvmapplication.activity.TemplateActivity;

/**
 * Created by gzd on 2019/4/1 0001
 */
//能够通过指定的fragment，创建并前往模板activity
public class TemplateUtil {

    private void generateActivity(Context context,Class fragment){
        context.startActivity(new Intent(context,TemplateActivity.class).putExtra("fName",fragment.getName()));
    }
}
