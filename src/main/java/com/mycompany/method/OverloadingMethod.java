
package com.mycompany.method;

import javax.swing.JOptionPane;

public class OverloadingMethod 
{

    public static void main(String[] args) 
    {
       String data;
       data = JOptionPane.showInputDialog("Enter Employlee Type (1 or 2)");
       int n = new Integer(data);
       employee_saraly emp = new employee_saraly();
       
       switch (n)
       {
           case 1 :
               data=JOptionPane.showInputDialog("Enter Employee Level (0 or 9)");
               float s1 = emp.satsalary(new Integer(data));
               JOptionPane.showConfirmDialog(null,"Salary = " + s1 + "TH Baht");
               break;
           case 2 :
               data = JOptionPane.showInputDialog("Enter Employee Grade (A or B)");
               String s2 = emp.setsalary(data);
               JOptionPane.showConfirmDialog(null,"Salary = " + s2 + "Us Dollar");
               break;
           default :
               JOptionPane.showConfirmDialog(null,"มึงใส่เลขมั่ว");
       }
           
    }
    
}
