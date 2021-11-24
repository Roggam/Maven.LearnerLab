package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    @Test
    public void testAdd() {
        //given
        People people = Students.getINSTANCE(); // 11 students
        Person person1 = new Person(999L, "RJ");
        Person person2 = new Person(555L, "Leon");
        Integer expected = 13;
        //when
        people.add(person1);
        people.add(person2);
        Integer actual = people.count();
        //then
        Assert.assertEquals(expected, actual);

    }


    @Test
    public void testRemove() {
        //given
        People people = Students.getINSTANCE(); // 11 Students
        Person person1 = new Person(111L, "JR");
        Person person2 = new Person(777L, "RJ");
        Integer expectedSize = 15;
        //when
        people.add(person1);
        people.add(person2); // added two people to instance because it's final can't remove from it unless I add to it first
        people.remove(person1);
        Integer actualSize = people.count();

        //then
        Assert.assertEquals(expectedSize, actualSize);
        Assert.assertFalse(people.contains(person1));
    }


    @Test
    public void testFindById() {
        //given
        People people = Students.getINSTANCE();
        Person person1 = new Person(1111L, "JR");
        String expected = "JR";


        //when
        people.add(person1);
        Person person = people.findById(1111L);
        String actual = person.getName();
        System.out.println(actual);
        //then
        Assert.assertEquals(expected, actual);


    }
}
