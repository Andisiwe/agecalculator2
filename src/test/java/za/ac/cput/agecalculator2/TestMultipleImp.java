package za.ac.cput.agecalculator2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.agecalculator2.Config.AppConfig;
import za.ac.cput.agecalculator2.Impl.MultipleImpl;

/**
 * Created by student on 2015/02/20.
 */
public class TestMultipleImp {
    private AgeCalculator ageCalc;
    private ApplicationContext ctx;
    private Person p;

    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        ageCalc = (AgeCalculator)ctx.getBean("ageCalc");
        p = (Person)ctx.getBean("ageCalc");

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testName() throws Exception {
        Assert.assertTrue("Name", p.getName("Andisiwe").equals("Andisiwe"));

    }

    @Test
    public void testAge() throws Exception {
        String age = ageCalc.calculateAge(1993);
        System.out.println(age);
        String actual = "22 years old";
        Assert.assertTrue("Age", age.equals(actual));

    }
}
