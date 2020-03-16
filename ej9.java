package com.mycompany.practica_fechas;

import java.time.temporal.ChronoUnit;
import java.time.*;

public class ej9 
{
    public static void main (String Args[])
    {
        LocalTime start= LocalTime.of(1,0, 0);
	LocalTime end= LocalTime.of(2,10,20);
	System.out.println(ChronoUnit.HOURS.between(start, end)+ " horas ");
	System.out.println(ChronoUnit.MINUTES.between(start, end)+ " minutos ");
	System.out.println(ChronoUnit.SECONDS.between(start, end)+" segundos ");
	System.out.println(ChronoUnit.MILLIS.between(start, end)+ " milisegundos");
	System.out.println(ChronoUnit.MICROS.between(start, end) +" microsegundos");
        System.out.println(ChronoUnit.NANOS.between(start, end)+ " nanosegundos ");
        System.out.println();
    }
}
