package com.mycompany.practica_fechas;


import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.*;

public class ej1
{
    public static void main (String Args[])
    {
        SimpleDateFormat formato1 = new SimpleDateFormat("yyyy-M-dd  HH:mm:ss E");
        SimpleDateFormat formato2 = new SimpleDateFormat("yyyy-M-dd");
        
        Date fecha1 = new Date();
        Date fecha2 = Calendar.getInstance().getTime();
        
        
       System.out.println(formato1.format(fecha1)+"fecha con el  formato1");
       System.out.println(formato2.format(fecha2)+"fecha con el  formato1");
    }
}
