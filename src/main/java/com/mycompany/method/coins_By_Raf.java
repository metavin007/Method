
package com.mycompany.method;

import java.util.Scanner;

class coins
{
    int ten,five,one;
}
class ExchaheCoin
{
    public void findCoin(coins c,int m)
    {
      c.ten = m/10;
      c.five = m%10/5;
      c.one = m%10%5;
    }
}
public class coins_By_Raf 
{
     public static void main(String[] args) 
    {
       Scanner scan = new Scanner(System.in);
       coins coin = new coins();
       ExchaheCoin coinData = new ExchaheCoin();
       System.out.print("อัตราเงินที่ใช้แลก = ");
       int money = scan.nextInt();
       coinData.findCoin(coin, money);
       System.out.println("เงิน" + money + " บาท แลกได้ " +" เหรียญสิบ "+ coin.ten +" เหรียญห้า "+ coin.five 
                +" เหรียญบาท "+ coin.one) ;
        }
    
}
