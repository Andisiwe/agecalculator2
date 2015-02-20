package za.ac.cput.agecalculator2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.agecalculator2.Config.AppConfig;
import za.ac.cput.agecalculator2.Impl.PersonDetailsImpl;

/**
 * Created by student on 2015/02/20.
 */
public class TestAge {
    private PersonDetails person;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        person = (PersonDetails)ctx.getBean("age");

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testAge() throws Exception {
        String age = person.age(1993);
        System.out.println(age);
        String actual = "22 years old";
        Assert.assertTrue("Age", age.equals(actual));

    }
}
