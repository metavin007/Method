
package com.mycompany.method;

import java.util.Scanner;

class tax
{
   public static float calvat1(float m)
{
    return 0.07f*m;
}
public static float calvat2(float m)
{
    return 0.03f*m;
} 
}
public class CalcurateTax 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("money = " );
        float money = scan.nextFloat();
        float totalvat1 = tax.calvat1(money);
        float totalvat2 = tax.calvat2(money);
        System.out.println("สินค้าราคา " + money + " บาท" 
                + " ภาษี 7% เป็นเงิน " + totalvat1 + " บาท"
        + " ภาษี 3% เป็นเงิน " + totalvat2 + " บาท"
        + " รวมเป็นเงิน " + (totalvat1+totalvat2) + " บาท");
    }
    
}
