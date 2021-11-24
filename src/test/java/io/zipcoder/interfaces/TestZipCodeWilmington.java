package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {
    @Test
    public void testHostLecture() {
        //Given
        Students students = Students.getINSTANCE();
        ZipCodeWilmington zipCodeWilmington = new ZipCodeWilmington();
        Double hoursToLearn = 1100.0;
        Double expectedHoursForEachStudent = 100.0;
        //When
        zipCodeWilmington.hostLecture(1L, hoursToLearn);
        Student actualStudent = (Student) students.getPersonList().get(0); // don't know why I have to cast it
        Double actualHours = actualStudent.getTotalStudyTime();

        //Then
        Assert.assertEquals(expectedHoursForEachStudent, actualHours);


    }


}
