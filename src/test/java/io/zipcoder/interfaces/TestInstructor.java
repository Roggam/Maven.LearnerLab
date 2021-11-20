package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;


public class TestInstructor {
    @Test

    public void testImplementation() {
        //given
        Instructor instructor = new Instructor(123L, "Leon");

        //when

        //then
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        //given
        Instructor instructor = new Instructor(123L, "Kris");
        //when

        //then
        Assert.assertTrue(instructor instanceof Person);

    }

    @Test
    public void testTeach() {
        //given
        Instructor instructor = new Instructor(123L, "Dolio");
        Learner student = new Student(123L, "JR");
        Double expected = 25.0;
        //when
        instructor.teach(student, expected);
        Double actual = student.getTotalStudyTime();
        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testLecture(){
    //given
    Instructor instructor = new Instructor(123L, "Tra");
    Learner student1 = new Student(123L,"JR");
    Learner student2 = new Student(456L, "John");
    Learner student3 = new Student(678L, "Jacob");
    Learner[] students = new Learner[]{student1,student2,student3};
    Double hours = 60.0;
    Double expected = 20.0;
    //when
    instructor.lecture(students,hours);

    //then
     Assert.assertEquals(expected,student1.getTotalStudyTime());
     Assert.assertEquals(expected, student2.getTotalStudyTime());
     Assert.assertEquals(expected, student3.getTotalStudyTime());
    }

}
