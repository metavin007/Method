
package com.mycompany.method;
class Bonus2 
{
    public static float calBonus(float s)
    {
        return 0.05f*s;
    }
}

public class staticMethod 
{

    public static void main(String[] args) 
    {
       System.out.println("Bonus = " + Bonus2.calBonus(400000)+" baht"); 
    }
    
}
// คำว่า new จะหายไป