package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People<S extends Person> {
    private List<Person> personList = new ArrayList<>();


    public void add(Person person) {
        personList.add(person);
    }

    public Person findById(long id) {
        Person newPerson = null;
        for (Person person : personList) {
            if (id == person.getId()) ;
            newPerson = person;
        }

        return newPerson;
    }


    public Boolean contains(Person person) {

        return personList.contains(person);
    }

    public void remove(Person person) {
        personList.remove(person);
    }

    public void removeById(long id) {
        for (Person person : personList) {
            if (person.getId() == id) {
                personList.remove(person);
            }

        }

    }

    public void removeAll(){
     personList.clear();

    }

    public int count(){

        return personList.size();
    }


    public Person[] toArray(){
      return personList.toArray(new Person[0]);
    }


    public Iterator<Person> iterator(){
        return personList.iterator();
    }

    public List<Person> getPersonList() {
        return personList;
    }
}
