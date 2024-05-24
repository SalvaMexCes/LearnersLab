package homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void testImplementation() {
        Student student = new Student(1, "Cesar Machado");
        assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance() {
        Student student = new Student(1, "Cesar Machado");
        assertTrue(student instanceof Person);
    }

    //Create a testLearn method that ensures a Student's totalStudyTime instance variable is incremented by the specified numberOfHours by invoking the .learn method.
    @Test
    public void testLearn() {
        Student student = new Student(1, "Cesar Machado");
        double studyTime = student.getTotalStudyTime();
        double numberOfHours = 5.0;
        student.learn(numberOfHours);
        assertEquals(studyTime + numberOfHours, student.getTotalStudyTime());
    }

}