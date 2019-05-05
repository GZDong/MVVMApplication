package com.gzd.example.mvvmapplication;

import android.app.Application;
import android.content.Context;

import com.gzd.example.mvvmapplication.gen.DaoMaster;
import com.gzd.example.mvvmapplication.gen.DaoSession;

import org.greenrobot.greendao.database.Database;

/**
 * Created by gzd on 2019/4/1 0001
 */
public class BaseApplication extends Application {
    private static DaoSession mDaoSession;
    private static Context sContext;
    @Override
    public void onCreate() {
        super.onCreate();
        setupDataBase(this);
        sContext = getApplicationContext();
    }

    private void setupDataBase(Context context){
        DaoMaster.DevOpenHelper openHelper = new DaoMaster.DevOpenHelper(context,"user-table");
        Database db = openHelper.getWritableDb();
        DaoMaster daoMaster = new DaoMaster(db);
        mDaoSession = daoMaster.newSession();
    }

    public static DaoSession getmDaoSession(){
        return mDaoSession;
    }

    public static Context getContext(){
        return sContext;
    }
}
