package com.example.rxandroid.model;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by zhang on 2016/12/28.
 */
@Data
@Accessors(prefix = "m")
public class AppInfo implements Comparable<Object> {

    long mLastUpdateTime;
    String mName;
    String mIcon;

    public AppInfo(String mName, long mLastUpdateTime, String mIcon){
        this.mName = mName;
        this.mLastUpdateTime = mLastUpdateTime;
        this.mIcon = mIcon;
    }

    @Override
    public int compareTo(Object another) {
        AppInfo appInfo = (AppInfo)another;
        return getName().compareTo(appInfo.getName());
    }
}
