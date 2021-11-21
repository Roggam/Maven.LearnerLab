package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    @Test
    public void testAdd(){
    //given
    Person expectedPerson = new Person(123L,"JR");
    People<Person> people = new People<Person>();
     //when
    people.add(expectedPerson);
    Person actual = people.getPersonList().get(0);
     //then
    Assert.assertEquals(expectedPerson, actual);

    }


    @Test
    public void testRemove(){
        //given
        Person person1 = new Person(123L,"JR");
        Person person2 = new Person(123L,"JR");
        People<Person> people = new People<Person>();
        people.add(person1);
        people.add(person2);
        Integer expectedSize = 1;
        //when
        people.remove(person2);
        Integer actualSize = people.count();

        //then
        Assert.assertEquals(expectedSize, actualSize);
    }


    @Test
    public void testFindById(){
      //given
        Person person1 = new Person(123L,"JR");
        Person person2 = new Person(456L,"Leon");
        People<Person> people = new People<Person>();
        people.add(person1);
        people.add(person2);
        String expected = person2.getName();
      //when
      String actual = people.findById(456L).getName();
      //then
        Assert.assertEquals(expected, actual);

    }
}
