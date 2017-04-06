package com.example.john.myapplication;

/**
 * Created by John on 4/1/2017.
 */


public class Nutrition {
    private double mFat;
    private double mCarbs;
    private double mProtein;
    private double mFatCals;
    private double mCarbCals;
    private double mProCals;

    public Nutrition(double Fat, double Carbs, double Protein){
        mFat = Fat;
        mCarbs = Carbs;
        mProtein = Protein;
        getCals();
    }

    private double totalCal(){
        double totalCal = mFatCals + mCarbCals + mProCals;
        return totalCal;
    }

    public double getFatCals() {
        return mFatCals;
    }

    public double getCarbCals() {
        return mCarbCals;
    }

    public double getProCals() {
        return mProCals;
    }

    public double setMacros(double fMacros, double cMacros, double pMacros) {
        mFat = fMacros;
        mCarbs = cMacros;
        mProtein = pMacros;
        getCals();
        double fatPercentMacro = mFatCals / totalCal();
        double carbsPercentMacro = mCarbCals / totalCal();
        double proteinPercentMacro = mProCals / totalCal();
        return 0.0;
    }

    private void getCals(){
        mFatCals = mFat * 9;
        mCarbCals = mCarbs * 4;
        mProCals = mProtein * 4;
    }

}


