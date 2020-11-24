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
        TechConnect techConnect = new TechConnect();
        techConnect.removeStudents();
        Assert.assertTrue((techConnect.getStudents()).isEmpty());
    }

    @Test
    public void testRecruitStudent(){
        //ensures that studentList is populated with Student objects
        TechConnect techConnect = new TechConnect();
        Student student1 = new Student("Bob");
        Student student2 = new Student("Sally");
        techConnect.recruitStudent(student1);
        techConnect.recruitStudent(student2);
        Assert.assertFalse((techConnect.getStudents()).isEmpty());
    }
}
