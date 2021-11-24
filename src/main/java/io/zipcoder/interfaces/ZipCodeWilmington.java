package io.zipcoder.interfaces;

import java.util.Map;
import java.util.TreeMap;

public class ZipCodeWilmington {
    Students students = Students.getINSTANCE();
    Instructors instructors = Instructors.getInstance();

    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(students.getPersonList().toArray(new Learner[0]), numberOfHours);
    }
    public void hostLecture(long id, double numberOfHours){
      hostLecture((Teacher) instructors.findById(id),numberOfHours); // had to cast instructors.findById(id) with (Teacher)
    }

    public Map<Student, Double> getStudentMap(){
     Map<Student, Double> studentMap = new TreeMap<>();
      for(Person person : Students.getINSTANCE().getPersonList()){ // loop thru list of person
          Student student = (Student) person; //get each student
          Double totalStudyHours = student.getTotalStudyTime(); // get each students total hours
          studentMap.put(student,totalStudyHours) ;
      }
      return studentMap;
    }
}
