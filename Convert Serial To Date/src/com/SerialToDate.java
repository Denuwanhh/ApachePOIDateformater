/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com;

import java.util.Calendar;
import java.util.Date;
/**
 * Can convert Excel dates with in 01/Jan/1900 - 11/Jul/5881510
 * @author Denuwan Himanga Hettiarachi
 */
public class SerialToDate {
    
    /**
     * Identify the passing parameter is within 0 - 2,147,483,647
     * @param number
     * @return boolean true/false
     */
    public boolean isNumber(String number)
    {
        boolean status = true;
        
        if(number != null && (!number.equals("")))
        {
            for(int i=0;i<number.length();i++)
            {
                if(number.charAt(i) < '0' || number.charAt(i) > '9')
                    status = false;
            }
        }
        
        return status;
    }
    
    /**
     * 01/Jan/1900 is Consider as 01  
     * @param serialNumber
     * @return null or calender.getTime()
     */
    public Date converterSerialToDate(int serialNumber)
    {
        Calendar calender;
        
        if(isNumber(serialNumber+""))
        {
            calender = Calendar.getInstance();
            calender.clear();
            calender.set(1899, 11, 31);
            calender.add(Calendar.DATE, serialNumber);
            return calender.getTime();
        }
        
        return null;
    }
}
