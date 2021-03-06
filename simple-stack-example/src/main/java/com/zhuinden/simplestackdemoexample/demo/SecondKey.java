package com.zhuinden.simplestackdemoexample.demo;

import android.os.Parcel;

import com.zhuinden.simplestackdemoexample.R;
/**
 * Created by Owner on 2017. 01. 12..
 */

public class SecondKey implements Key {
    public SecondKey() {

    }

    protected SecondKey(Parcel in) {
    }

    public static final Creator<SecondKey> CREATOR = new Creator<SecondKey>() {
        @Override
        public SecondKey createFromParcel(Parcel in) {
            return new SecondKey(in);
        }

        @Override
        public SecondKey[] newArray(int size) {
            return new SecondKey[size];
        }
    };

    @Override
    public int layout() {
        return R.layout.path_second;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    @Override
    public int hashCode() {
        return SecondKey.class.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }
        return obj instanceof SecondKey;
    }
}
