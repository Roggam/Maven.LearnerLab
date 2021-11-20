package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void testConstructor(){
      //given
      String expectedName = "Leon";
      Long expectedId = 123L;
      Person person = new Person(expectedId, expectedName);
      //when
        String actualName = person.getName();
        Long actualId = person.getId();
      //then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName(){
      //given
        String name = "Leon";
        Long Id = 123L;
        Person person = new Person(Id, name);
        String expectedName = "Dolio";
        person.setName(expectedName);
      //when
         String actualName = person.getName();
      //then
        Assert.assertEquals(expectedName, actualName);
    }


}
