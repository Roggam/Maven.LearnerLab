package io.zipcoder.interfaces;

public final class Students extends People<Student> {

    //final makes is unextendable
    private static final Students INSTANCE = new Students();

    private Students() {
        add(new Student(1L, "JR"));
        add(new Student(2L, "David"));
        add(new Student(3L, "Amanda"));
        add(new Student(4L, "Cay"));
        add(new Student(5L, "Mike"));
        add(new Student(6L, "Carnell"));
        add(new Student(7L, "Keerthana"));
        add(new Student(8L, "Paul"));
        add(new Student(9L, "John"));
        add(new Student(10L, "Jacob"));
        add(new Student(11L, "Tra"));
    }

    public static Students getINSTANCE() { //struggled with this static method
        return INSTANCE;
    }
}
