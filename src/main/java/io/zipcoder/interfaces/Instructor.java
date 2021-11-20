package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher{
 private double numberOfHoursPerLearner;

    public Instructor(Long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
    learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberHours) {
     for(Learner learner : learners){
       learner.learn(numberHours / learners.length);
     }
    }
}
