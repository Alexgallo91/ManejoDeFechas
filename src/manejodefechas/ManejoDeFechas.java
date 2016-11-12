
package manejodefechas;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ManejoDeFechas {

    public static void main(String[] args) 
    {
//        Date fecha = new Date();
//        int anio;
//        int day = fecha.getDay();
//        
//        anio = fecha.getYear();
//        
//        System.out.println(anio + 1900);
//        System.out.println(day);
        
        Calendar calendaria = Calendar.getInstance();
        int anio = calendaria.get(Calendar.YEAR);
        Calendar calendario2 = new GregorianCalendar(2015, Calendar.NOVEMBER, 25);
        int anio2 = calendario2.get(calendario2.YEAR);
        int mes = calendario2.get(Calendar.MONTH);
        
        System.out.println("El año es: " + anio);
        System.out.println("El año es: "+anio2);
        System.out.println("El mes es: " + mes);
    }
    
}
