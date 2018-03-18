package com.reportapp071997.reportcard;

/**
 * Created by abc on 01-02-2018.
 */

public class ReportCard {
    private String mEnglishGrade;
    private int mMathsGrade;
    private char mHindiGrade;
    private double mScienceGrade;
    private String mStudentName;
    public ReportCard(String studentName,String englishGrade,int mathsGrade,char hindiGrade,double scienceGrade){
        mStudentName = studentName;
        mEnglishGrade = englishGrade;
        mMathsGrade = mathsGrade;
        mHindiGrade = hindiGrade;
        mScienceGrade = scienceGrade;
    }
    public void setStudentName(String name){
        mStudentName = name;
    }
   public void setMathsGrade(int math){
         mMathsGrade = math;
    }
    public void setEnglishGrade(String english){
        mEnglishGrade = english;
    }
    public void setHindiGrade(char hindi){
        mHindiGrade = hindi;
    }
    public void setScienceGrade(double science){
        mScienceGrade = science;
    }
    public String getEnglishGrade(){
        return mEnglishGrade;
    }
    public int getMathsGrade(){
        return mMathsGrade;
    }
    public char getHindiGrade(){
        return mHindiGrade;
    }
    public double getScienceGrade(){
        return mScienceGrade;
    }
    public String getStudentName(){
        return mStudentName;
    }
    @Override
    public String toString(){
        return ("Name: "+mStudentName+" Math: "+mMathsGrade+" English: "+mEnglishGrade+" Hindi: "+mHindiGrade+" Science: "+mScienceGrade);
    }
}
