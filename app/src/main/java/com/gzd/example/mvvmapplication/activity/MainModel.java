package com.gzd.example.mvvmapplication.activity;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.gzd.example.mvvmapplication.R;

/**
 * Created by gzd on 2019/3/28 0028
 */
public class MainModel extends BaseObservable {
    private String name;
    private int age;
    private String img;

    public MainModel() {
    }

    public MainModel(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public MainModel(String name, int age, String img) {
        this.name = name;
        this.age = age;
        this.img = img;
    }

    @BindingAdapter("bind:imgSrc")
    public static void setImage(ImageView imageView, String url){   //model  -> adapter  ->  view
        Log.e("tag", "setImage: " +  url );
        Glide.with(imageView.getContext()).load(R.drawable.ic_launcher_background).into(imageView);
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Bindable   // view(as observer)  ->  model(as observable)
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        notifyChange();
    }

    public void onItemClick(View view) {
        Log.e("tag", "onItemClick: " + "HEHE" );
        Toast.makeText(view.getContext(), "okokok", Toast.LENGTH_SHORT).show();
        setAge(30);
    }
}
