package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person> implements Iterable<E> {
    private List<E> personList = new ArrayList<>();


    public void add(E person) {
        personList.add(person);
    }

    public E findById(long id) {
        E newPerson = null;
        for (E person : personList) {
            if (id == person.getId()) ;
            newPerson = person;
        }

        return newPerson;
    }


    public Boolean contains(E person) {

        return personList.contains(person);
    }

    public void remove(E person) {
        personList.remove(person);
    }

    public void removeById(long id) {
        for (E person : personList) {
            if (person.getId() == id) {
                personList.remove(person);
            }

        }

    }

    public void removeAll() {
        personList.clear();

    }

    public int count() {

        return personList.size();
    }

public abstract E[] getArray();
//
//    public E[] toArray() {
//        return personList.toArray(new E[0]);
//    }


    public Iterator<E> iterator() {
        return personList.iterator();
    }

    public List<E> getPersonList() {
        return personList;
    }
}
