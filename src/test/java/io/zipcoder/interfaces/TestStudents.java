package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void test() {
        Students students = Students.getINSTANCE();

        int expected = 15; // it's 15 because I added more students to instance on people test
        int actual = students.count();

        Assert.assertEquals(expected, actual);
    }

}
