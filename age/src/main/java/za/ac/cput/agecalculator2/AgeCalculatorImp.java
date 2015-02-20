package za.ac.cput.agecalculator2;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by student on 2015/02/20.
 */
public class AgeCalculatorImp implements AgeCalculator{

    @Override
    public String calculateAge(int year) {
        Calendar now = new GregorianCalendar();
        int y = now.get(Calendar.YEAR);

        return (y - year) + " years old";
    }
}
