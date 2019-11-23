package lt.sdacademy.fundamentals.date_time;

import java.util.Calendar;
import java.util.Date;

public class Example1 {

    public static void main(String[] args) {

        Date now = new Date();
        //Arba
        long millis = System.currentTimeMillis();//milisekundes
        now = new Date(millis); //i datos kontruktoriu paduodam milisekunde data
        System.out.println(now); //trec Kovo 13 21:38 2019

        Calendar cal = Calendar.getInstance(); // pasiima esama masinos laika milisekundes laiku, taciau kalendoriaus laiku
        Date date = cal.getTime(); // konvertuojamas Calendar objektas i Date objekta
        System.out.println(date); // trec Kovo 13 21:38 2019

        cal.setTime(now); //konvertuojamas Date objektas i Calendar objekta
        System.out.println(cal.get(Calendar.YEAR)); //2019 YEAR - konstanta
        System.out.println(cal.get(Calendar.DAY_OF_YEAR)); //72
        System.out.println(cal.get(Calendar.WEEK_OF_YEAR)); //11
    }
}
