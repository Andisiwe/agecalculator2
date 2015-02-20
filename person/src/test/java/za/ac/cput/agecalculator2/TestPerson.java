package za.ac.cput.agecalculator2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/20.
 */
public class TestPerson {
    Person p;

    @Before
    public void setUp() throws Exception {
        p = new PersonImpl();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testGetName() throws Exception {
        Assert.assertTrue("Name", p.getName("Andisiwe").equals("Andisiwe"));

    }
}
