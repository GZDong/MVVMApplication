package com.gzd.example.mvvmapplication.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.ToOne;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by gzd on 2019/4/1 0001
 */
@Entity
public class dayStep {
    @Id
    private long id;
    private String date;
    @NotNull
    private int step;
    private Long sportId;
    @Generated(hash = 1078273959)
    public dayStep(long id, String date, int step, Long sportId) {
        this.id = id;
        this.date = date;
        this.step = step;
        this.sportId = sportId;
    }
    @Generated(hash = 1348095957)
    public dayStep() {
    }
    public long getId() {
        return this.id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getDate() {
        return this.date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public int getStep() {
        return this.step;
    }
    public void setStep(int step) {
        this.step = step;
    }
    public Long getSportId() {
        return this.sportId;
    }
    public void setSportId(Long sportId) {
        this.sportId = sportId;
    }
    
}
