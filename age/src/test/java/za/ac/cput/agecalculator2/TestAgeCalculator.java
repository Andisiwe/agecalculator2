package za.ac.cput.agecalculator2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/20.
 */
public class TestAgeCalculator {
    AgeCalculator ageCalc;

    @Before
    public void setUp() throws Exception {
        ageCalc = new AgeCalculatorImp();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testCalculateAge() throws Exception {
        String age = ageCalc.calculateAge(1993);
        System.out.println(age);
        String actual = "22 years old";
        Assert.assertTrue("Age", age.equals(actual));

    }
}
