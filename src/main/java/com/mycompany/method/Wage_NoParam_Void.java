
package com.mycompany.method;

class wage
{
    public int h;
    public float r;
    public void calWage()
    {
        float total = (40*r) + (h-40)*(1.5f*r);
        System.out.println("ค่าแรงรวม = " + total + "บาท");
    }
}

public class Wage_NoParam_Void 
{

    public static void main(String[] args) 
    {
       wage ooo = new wage();
       ooo.h = 50;
       ooo.r = 100.0f;
       ooo.calWage();
    }
    
}
