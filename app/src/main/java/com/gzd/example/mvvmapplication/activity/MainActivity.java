package com.gzd.example.mvvmapplication.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.gzd.example.mvvmapplication.BaseApplication;
import com.gzd.example.mvvmapplication.R;
import com.gzd.example.mvvmapplication.bean.User;
import com.gzd.example.mvvmapplication.databinding.ActivityMainBinding;
import com.gzd.example.mvvmapplication.gen.DaoSession;
import com.gzd.example.mvvmapplication.gen.UserDao;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mBinding;
    private DaoSession mDaoSession;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        mBinding.setUser(new MainModel("john",25,"http://img2.cache.netease.com/auto/2016/7/28/201607282215432cd8a.jpg"));  //model  ->  view
        User user = new User(null,20,"john");
        mDaoSession = BaseApplication.getmDaoSession();
        addUser(user);

    }

    public void onItemClick(View view) {
        Log.e("tag", "onItemClick: " + "HEHE" );
        Toast.makeText(view.getContext(), "okokok", Toast.LENGTH_SHORT).show();
    }

    public void addUser(User user){
        mDaoSession.getUserDao().insert(user);
    }

    public void deleteUser(Long uid){
        mDaoSession.getUserDao().deleteByKey(1l);
    }

    public void update(User user){
        user.setName("change");
        mDaoSession.update(user);
    }
    public List<User> getUser(){
        List<User> result;
        result = mDaoSession.queryBuilder(User.class).where(UserDao.Properties.Name.eq("john")).list();
        result = mDaoSession.queryRaw(User.class,"name = ?","john");
        return result;

    }
}
