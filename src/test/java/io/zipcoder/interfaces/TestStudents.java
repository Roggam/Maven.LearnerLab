package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void test() {
        Students students = Students.getINSTANCE();

//        students.add(new Student(1L, "JR"));
//        students.add(new Student(2L, "David"));
//        students.add(new Student(3L, "Amanda"));
//        students.add(new Student(4L, "Cay"));
//        students.add(new Student(5L, "Mike"));
//        students.add(new Student(6L, "Carnell"));
//        students.add(new Student(7L, "Keerthana"));
//        students.add(new Student(8L, "Paul"));
//        students.add(new Student(9L, "John"));
//        students.add(new Student(10L, "Jacob"));
//        students.add(new Student(11L, "Tra"));
        int expected = 11;
        int actual = students.count();

        Assert.assertEquals(expected, actual);
    }

}
