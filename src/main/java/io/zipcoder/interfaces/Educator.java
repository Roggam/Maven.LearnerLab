package io.zipcoder.interfaces;

public enum Educator implements Teacher{
KRIS(new Instructor(1L,"Kris")),
DOLIO(new Instructor(2L, "Dolio")),
LEON(new Instructor(3L, "Leon"));

final Instructor instructor;
double timeWorked;

Educator(Instructor instructor){
    this.instructor = instructor;
    Instructors.getInstance().add(instructor);
}

    @Override
    public void teach(Learner learner, double numberOfHours) {
    this.instructor.teach(learner,numberOfHours);
    this.timeWorked += numberOfHours;

    }

    @Override
    public void lecture(Learner[] learners, double numberHours) {
    this.instructor.lecture(learners,numberHours);
    this.timeWorked += numberHours;

    }
}
