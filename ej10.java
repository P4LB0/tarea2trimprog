package com.mycompany.practica_fechas;

import java.time.*;
import java.util.*;

public class ej10 
{
    public static void main (String Args[])
    {
        TimeZone asia_kolkata= TimeZone.getTimeZone("Asia/Kolkata");
	TimeZone.setDefault(asia_kolkata);
	Date asia= new Date();
        
	System.out.println(asia+ "  hora asia/kolkata");
        
	ZoneId nipon= ZoneId.of("Japan");
	TimeZone japones= TimeZone.getTimeZone(nipon);
	Date fechanipon= new Date();
	TimeZone.setDefault(japones);
        
	System.out.println(fechanipon+ " hora japon");
	System.out.println();
    }
}
