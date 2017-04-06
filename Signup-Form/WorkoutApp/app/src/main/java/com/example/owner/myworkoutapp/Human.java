package com.example.owner.myworkoutapp;

/**
 * Created by Owner on 4/1/2017.
 */

public class Human {
    private int mHeight;
    private int mWeight;
    private String mEthnicity;
    private String mName;
    private int mIncome;

public Human( int height, int weight, String ethnicity, String name, int income) {
    mHeight = height;
    mWeight = weight;
    mEthnicity = ethnicity;
    mName = name;
    mIncome = income;
}

public String getName(){
    return mName;
    }
}



