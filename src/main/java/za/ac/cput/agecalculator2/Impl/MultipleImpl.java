package za.ac.cput.agecalculator2.Impl;

import za.ac.cput.agecalculator2.AgeCalculator;
import za.ac.cput.agecalculator2.Person;
import za.ac.cput.agecalculator2.PersonDetails;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by student on 2015/02/20.
 */
public class MultipleImpl implements AgeCalculator, Person, PersonDetails {
    @Override
    public String calculateAge(int year) {
        Calendar now = new GregorianCalendar();
        int y = now.get(Calendar.YEAR);

        return (y - year) + " years old";
    }

    @Override
    public String getName(String n) {
        return n;
    }

    @Override
    public String name(String nm) {
        return nm;
    }

    @Override
    public String age(int year) {
        Calendar now = new GregorianCalendar();
        int y = now.get(Calendar.YEAR);

        return (y - year) + " years old";

    }
}
