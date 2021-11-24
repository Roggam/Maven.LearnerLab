package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void test() {
        Students students = Students.getINSTANCE();

        int expected = 11;
        int actual = students.count();

        Assert.assertEquals(expected, actual);
    }

}
