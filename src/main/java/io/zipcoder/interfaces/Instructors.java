package io.zipcoder.interfaces;

public class Instructors extends People<Instructor>{
    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        add(new Instructor(1L,"Kris"));
        add(new Instructor(2L,"Dolio"));
        add(new Instructor(3L,"Leon"));

    }
    public static Instructors getInstance(){
        return INSTANCE;
    }
}
