package com.mycompany.practica_fechas;

import java.util.Calendar;
import java.util.GregorianCalendar;
public class ej2 
{
    public static void main (String Args[])
    {
        Calendar calendario = new GregorianCalendar(1990,11,31);
        calendario.set(1990,11,31, 0, 0, 0);
        System.out.println(calendario.getTime());
    }
}
