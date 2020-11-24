package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestZipCodeWilmington {
    @Before
    public void setup(){
        ZipCodeWilmington zipcode = new ZipCodeWilmington();
        zipcode.fireStaff();
    }

    @Test
    public void testFireStaff(){
        Assert.assertTrue(instructorList.isEmpty());
    }

    @Test
    public void testHireStaff(){
        zipcode.hireStaff();
        Assert.assertTrue(instructorList.isEmpty());
    }
}
