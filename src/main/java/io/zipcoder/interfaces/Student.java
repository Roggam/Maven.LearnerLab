package io.zipcoder.interfaces;

public class Student extends Person implements Learner{
private Double totalStudyTime = 0.0;

    public Student(Long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(double numberOfHours) {
     totalStudyTime += numberOfHours;
    }

    @Override
    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
