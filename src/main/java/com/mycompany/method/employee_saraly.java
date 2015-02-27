package com.mycompany.method;

public class employee_saraly 
{
    float satsalary(int t1)
    {
        float salary = 0;
        if(t1 >= 0 && t1<=4)
        {
            salary = 10000;
        }
        if(t1 >= 5 && t1<=9)
        {
            salary = 20000;
        }
        return salary;
    }
    String setsalary(String t2)
    {
        String salary="";
        if(t2.equals("A"))
        {
            salary = "$750";
        }
        if(t2.equals("B"))
        {
            salary = "&500";
        }
        return salary;
    }
}
    