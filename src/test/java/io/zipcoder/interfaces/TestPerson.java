package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructName(){
        String expected = "Bob";
        Person person = new Person(expected);
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetName(){
        Person person = new Person("Sally");
        String expected = "Bob";
        person.setName(expected);
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }
}
