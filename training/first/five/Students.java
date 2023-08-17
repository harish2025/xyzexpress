package com.training.first.five;



public class Students {
    int studentId;
    int sub1;
    int sub2;
    int sub3;
    int sub4;
    int sub5;
    int total=(sub1+sub2+sub3+sub4+sub5);
    public Students(int id,int tamil,int english,int maths,int science,int social)
    {
        studentId=id;
        sub1=tamil;
        sub2=english;
        sub3=maths;
        sub4=science;
        sub5=social;


    }



}
