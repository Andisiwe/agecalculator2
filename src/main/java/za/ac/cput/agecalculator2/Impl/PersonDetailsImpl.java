package za.ac.cput.agecalculator2.Impl;

import za.ac.cput.agecalculator2.PersonDetails;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by student on 2015/02/20.
 */
public class PersonDetailsImpl implements PersonDetails {
    @Override
    public String name(String n) {
        return n;
    }

    @Override
    public String age(int year) {
        Calendar now = new GregorianCalendar();
        int y = now.get(Calendar.YEAR);

        return (y - year) + " years old";
    }
}
