
package com.mycompany.method;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.xml.crypto.Data;

public class CalendarText 
{

    public static void main(String[] args) 
    {
        Calendar calenName = Calendar.getInstance();
        System.out.println("Current DataTime is : " + calenName.getTime());
        SimpleDateFormat df = new SimpleDateFormat("d/MM/yyyy HH:mm:ss");
        System.out.println("Current DataTime is : " + df.format(calenName.getTime()));
    }
    
}
