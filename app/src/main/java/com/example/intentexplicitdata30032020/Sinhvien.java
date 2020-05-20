package com.example.intentexplicitdata30032020;

import android.os.Parcel;
import android.os.Parcelable;

public class Sinhvien implements Parcelable {
    String name;
    Integer age;

    public Sinhvien(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    protected Sinhvien(Parcel in) {
        name = in.readString();
        if (in.readByte() == 0) {
            age = null;
        } else {
            age = in.readInt();
        }
    }

    public static final Creator<Sinhvien> CREATOR = new Creator<Sinhvien>() {
        @Override
        public Sinhvien createFromParcel(Parcel in) {
            return new Sinhvien(in);
        }

        @Override
        public Sinhvien[] newArray(int size) {
            return new Sinhvien[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        if (age == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(age);
        }
    }
}
