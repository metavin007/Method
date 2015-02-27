
package com.mycompany.method;

class wage1
{
   public void calWage(int h,float r)
   {
       float total = (40*r) + (h-40)*(1.5f*r);
       System.out.println("ค่าแรงรวม = " + total + "บาท");
   }
}

public class Wage_Param_Void 
{

    public static void main(String[] args) 
    {
        wage1 ooo = new wage1();
        ooo.calWage(50,200.0f);
    }
    
}
