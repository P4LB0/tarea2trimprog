package com.mycompany.practica_fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ej3 
{
    public static void main (String Args[])
    {
        String StringFecha= "02-6-2016";
	SimpleDateFormat formateo= new SimpleDateFormat("MM-dd-yyyy");//ESTO CREA EL FORMATO A DEVOLVER
	Date fecha=null;
        try {
            fecha= formateo.parse(StringFecha); 
        }
        catch(ParseException e ){
            e.printStackTrace();
        }
	
	System.out.println(formateo.format(fecha)); 
    }
}
