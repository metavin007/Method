
package com.mycompany.method;

public class Bonus3
{
   public float myBonus;
   public Bonus3()
   {
       myBonus = 0;
   }
   public float calBonus(float s)
   {
       myBonus = 0.05f*s;
       return myBonus;
   }
}

