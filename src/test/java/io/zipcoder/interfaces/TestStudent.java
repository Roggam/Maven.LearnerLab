package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testImplementation(){
     //given
     Student student = new Student(123L,"Leon");
     //when

     //then
        Assert.assertTrue(student instanceof  Learner);
    }

    @Test
    public void testInheritance(){
        //given
        Student student = new Student(123L,"Leon");
        //when

        //then
        Assert.assertTrue(student instanceof  Person);
    }

@Test
    public void testLearn(){
      //given
    Student student = new Student(123L,"Leon");
    Double expected = 30.0;
    //when
    student.learn(expected);
   Double actual = student.getTotalStudyTime();
    //then
    Assert.assertEquals(expected,actual);

}
}
