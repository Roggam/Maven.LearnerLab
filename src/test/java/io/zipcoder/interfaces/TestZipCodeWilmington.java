package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

public class TestZipCodeWilmington {
    @Test
    public void testHostLecture() {
        //Given
        Students students = Students.getINSTANCE();
        ZipCodeWilmington zipCodeWilmington = new ZipCodeWilmington();
        Educator educator = Educator.LEON;
        Double hoursToLearn = 1100.0;
        Double expectedHoursForEachStudent = 100.0;
        //When
        zipCodeWilmington.hostLecture(educator, hoursToLearn);

        Map<Student, Double> map = zipCodeWilmington.getStudentMap();

        Double actualHours = map.get(zipCodeWilmington.getStudents().getPersonList().get(0));

        //Then
        Assert.assertEquals(expectedHoursForEachStudent, actualHours);


    }


}
