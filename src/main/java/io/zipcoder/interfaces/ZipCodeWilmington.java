package io.zipcoder.interfaces;

import java.util.Map;
import java.util.TreeMap;

public class ZipCodeWilmington {
    Students students = Students.getINSTANCE();
    Instructors instructors = Instructors.getInstance();

    public void hostLecture(Teacher teacher, double numberOfHours) {
        Learner[] learners = students.getPersonList().toArray(new Learner[0]);
        teacher.lecture(learners, numberOfHours);
    }
    public void hostLecture(long id, double numberOfHours){
      hostLecture(instructors.findById(id),numberOfHours); // had to cast instructors.findById(id) with (Teacher)
    }

    public Map<Student, Double> getStudentMap(){
     Map<Student, Double> studentMap = new TreeMap<>();
      for(Student students : Students.getINSTANCE().getPersonList()){ // loop thru list of student
          Student student =  students; //get each student
          Double totalStudyHours = student.getTotalStudyTime(); // get each students total hours
          studentMap.put(student,totalStudyHours) ;
      }
      return studentMap;
    }

    public Students getStudents() {
        return students;
    }

    public Instructors getInstructors() {
        return instructors;
    }
}
