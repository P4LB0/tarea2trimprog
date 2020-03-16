package com.mycompany.practica_fechas;

import java.time.*;


public class ej4y5 
{
    public static void main (String Args[])
    {
        final LocalDate now=LocalDate.now();
	final LocalDate cumpleaños2= LocalDate.of(2012, Month.AUGUST, 23);
	final LocalDate cumpleaños3= LocalDate.of(2012, 8, 23);
        
        System.out.println(now.isBefore(cumpleaños2));
        System.out.println(now.isAfter(cumpleaños2));
        System.out.println(cumpleaños2.isEqual(cumpleaños3));

    }
}
