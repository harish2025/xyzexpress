package com.training.first.five;

public class Calculate {
    public static void main(String[] args) {
        Students s1 = new Students(100012,82,45,65,78,45);
        Students s2 = new Students(10018,54,37,87,98,34);
        Students s3 = new Students(17009,67,89,90,65,78);

    if(s1.sub1>s2.sub1 & s1.sub1 >s3.sub1)
    {
        System.out.println("the S1 is the higest mark in Tamil");
    } else if (s2.sub1>s1.sub1 & s2.sub1 >s3.sub1) {
        System.out.println("the S2 is the higest mark in Tamil");
    }
    else{
        System.out.println("s3 is higest mark i tamil");
    }
        if(s1.sub2>s2.sub2 & s1.sub2 >s3.sub2)
        {
            System.out.println("the S1 is the higest mark in english");
        } else if (s2.sub2>s1.sub2 & s2.sub2 >s3.sub2) {
            System.out.println("the S2 is the higest mark in english");
        }
        else{
            System.out.println("s3 is higest mark i english");
        }
    }

}
