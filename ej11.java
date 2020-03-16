package com.mycompany.practica_fechas;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class ej11 
{
    public static void main (String Args[])
    {
        LocalTime horanipon=  LocalTime.now();
	System.out.println(horanipon+ " la hora d japon");
	TimeZone españita= TimeZone.getTimeZone("GMT+1");
	TimeZone.setDefault(españita);
	LocalTime horaEspañita= LocalTime.now(); 
	System.out.println(horaEspañita+ " hora de españita");
	System.out.println("la diferencia horaria entre españita y japon es: " +ChronoUnit.HOURS.between(horanipon, horaEspañita));
    }
}
