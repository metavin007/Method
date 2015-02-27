
package com.mycompany.method;
class wage3
{
   public float calWage3(int h,float r)
   {
      return (40*r)+ (h-40)*(1.5f*r);
   }
}
public class Wage_Param_Return 
{

    public static void main(String[] args) 
    {
        wage3 ooo = new wage3();
        float total = ooo.calWage3(50,400.0f);
       System.out.println("ค่าแรงรวม = " + total + "บาท");
    }
    
}
