
package com.mycompany.method;

class Bonus1 
{
    public float calBonus(float s)
    {
        return 0.05f*s;
    }
}

public class instanceMethod 
{

    public static void main(String[] args) 
    {
        System.out.println("Bonus = " + new Bonus1().calBonus(500000)+" baht"); 
    }
    
}
