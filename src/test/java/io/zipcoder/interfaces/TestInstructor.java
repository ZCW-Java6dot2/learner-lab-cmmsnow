package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor("Bob");
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor("Bob");
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        Instructor instructor = new Instructor("Bob");
        Student student = new Student("Jerry");
        double expected = 18;
        instructor.teach(student, expected);
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0.00001);
    }

    @Test
    public void testLecture(){
        Instructor instructor = new Instructor("Bob");
        Student student1 = new Student("Sal");
        Student student2 = new Student("Manny");
        Student student3 = new Student("Tom");
        Student[] students = new Student[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        double expected = 0 + 10;
        instructor.lecture(students, 30);
        double actual = student1.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0.00001);
    }
}
