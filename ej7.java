package com.mycompany.practica_fechas;


import java.time.temporal.ChronoUnit;
import java.time.*;


public class ej7 
{
    public static void main (String Args[])
    {
        LocalDate fecha1 =  LocalDate.of(2020,3,8);
	LocalDate fecha2= LocalDate.of(2020, 3, 15);//los DIAS DE CUARENTENA QUE LLEVAMOS A DIA DE HOY 15 DE MARZO
	System.out.println(fecha1);
	System.out.println(fecha2);
	System.out.println(ChronoUnit.DAYS.between(fecha1, fecha2)+ " diferencia en dias");
	System.out.println();
    }
}
