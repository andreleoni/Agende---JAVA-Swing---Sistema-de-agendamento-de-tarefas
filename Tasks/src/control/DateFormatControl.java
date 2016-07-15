package control;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class DateFormatControl {

    public String formatarHora(String data) {

        SimpleDateFormat formatador = new SimpleDateFormat("ddMMyyyyHHmm");
        String novaData = formatador.format(data);

        return novaData;

    }

    //Ajustar Datas
    /*
        y = Year
        M = Month of the year
        D = Day of the year
        d = Day of the month
        H = hour of the Day
        h = hour in am/pm
        m = minute in the hour
        s = seconds in minute
        S = miliseconds in minute    
     */
}
