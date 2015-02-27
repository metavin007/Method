
package com.mycompany.method;

public class ConstructorMethod 
{
    public static void main(String[] args) 
    {
       System.out.println("Bonus = " + new Bonus3().myBonus + " บาท");
       System.out.println("Bonus = " + new Bonus3().calBonus(30000) + " บาท"); 
    }
    
}
