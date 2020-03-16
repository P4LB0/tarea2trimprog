
package com.mycompany.practica_fechas;

import java.time.temporal.ChronoUnit;
import java.time.*;


public class ej8 
{
    public static void main (String args[])
    {
        LocalDate hoy= LocalDate.now();
	System.out.println(hoy);
        
	LocalDate pasaomanana= ChronoUnit.DAYS.addTo(hoy, 3);
	System.out.println(pasaomanana);
        
	LocalTime hoy2= LocalTime.now();
	System.out.println(hoy2);
        
	LocalTime hoy3 =hoy2.plusHours(1);
	System.out.println(hoy3);
        
	System.out.println(ChronoUnit.DAYS.between(hoy, pasaomanana));
        
	System.out.println();
    }
}
