package com.mycompany.practica_fechas;

import java.time.*;
import java.util.*;

public class ej6 
{
    public static void main(String Args[])
    {
        System.out.println(ZoneId.getAvailableZoneIds());
        
        TimeZone canada_yukon = TimeZone.getTimeZone("Canada/Yukon");
        TimeZone.setDefault(canada_yukon);
        Date horacanada = new Date();
        System.out.println(horacanada+ "la hora de canada/yukon ");
        
    }
}
