package com.training.first.SecondProgram;


    public class check
    {
        public static void main(String args[])
        {
            String  str="wFvLrl2xQjyrWrxeNI21@#9w";
            splitString(str);
        }

        static void splitString(String str)
        {

            StringBuffer alpha = new StringBuffer();
            StringBuffer num = new StringBuffer();
            StringBuffer special = new StringBuffer();
            for (int i=0; i<str.length(); i++)
            {
                if (Character.isDigit(str.charAt(i)))
                    num.append(str.charAt(i));
                else if(Character.isAlphabetic(str.charAt(i)))
                    alpha.append(str.charAt(i));
                else
                    special.append(str.charAt(i));
            }
            System.out.println(alpha);
            System.out.println(num);
            System.out.println(special);
        }

    }
