
package com.mycompany.method;

class wage2
{
    public int h;
    public float r;
    public float calWage2()
    {
        return (40*r) + (h-40)*(1.5f*r);
        
    }
}

public class Wage_NoParam_Return 
{

    public static void main(String[] args) 
    {
       wage2 ooo = new wage2();
       ooo.h = 50;
       ooo.r = 300.0f;
       float total = ooo.calWage2();
       System.out.println("ค่าแรงรวม = " + total + "บาท");        
    }
    
}
