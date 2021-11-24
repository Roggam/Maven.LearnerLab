package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    @Test
    public void test(){
      Instructors instructors = Instructors.getInstance();

      int expected = 3;
      int actual = instructors.count();
        Assert.assertEquals(expected, actual);

    }
}
