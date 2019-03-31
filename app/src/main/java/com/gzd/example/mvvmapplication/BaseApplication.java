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
    @Override
    public void onCreate() {
        super.onCreate();

    }

    private void setupDataBase(Context context){
        DaoMaster.DevOpenHelper openHelper = new DaoMaster.DevOpenHelper(context,"UserTable");
        Database db = openHelper.getWritableDb();
        DaoMaster daoMaster = new DaoMaster(db);
        mDaoSession = daoMaster.newSession();
    }

    public static DaoSession getmDaoSession(){
        return mDaoSession;
    }
}
