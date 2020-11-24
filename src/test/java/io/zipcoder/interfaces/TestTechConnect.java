package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestTechConnect {
    @Before
    public void setup(){
        TechConnect techConnect = new TechConnect();
        techConnect.removeStudents();
    }

    @Test
    public void testRemoveStudents(){
        //assert true that studentList is empty upon invocation
    }

    @Test
    public void testRecruitStudent(){
        //ensures that studentList is populated with Student objects
    }
}
