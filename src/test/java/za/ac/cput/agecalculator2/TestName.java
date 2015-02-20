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
public class TestName {
    private PersonDetails pd;
    private ApplicationContext ctx;


    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        pd = (PersonDetails)ctx.getBean("age");

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testName() throws Exception {
        Assert.assertTrue("Name", pd.name("Andisiwe").equals("Andisiwe"));

    }
}
