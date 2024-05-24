package homework;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

//import static org.junit.Assert.*;

public class InstructorTest {

    @Test
    public void testImplementation() {
        Instructor instructor = new Instructor(1, "Alexander West");
        assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        Instructor instructor = new Instructor(1, "Alexander West");
        assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach() {
        Instructor instructor = new Instructor(1, "Alexander West");
        Student student = new Student(456, "Alice");
        double numberOfHours = 3.5;

        instructor.teach(student, numberOfHours);
        assertEquals(numberOfHours, student.getTotalStudyTime());
    }

    @Test
    public void testLecture() {

        Instructor instructor = new Instructor(1, "Alexander West");

        Student[] students = {
                new Student(123, "Alice"),
                new Student(456, "Bob"),
                new Student(789, "Joe")
        };

        double numberOfHours = 40.0;
        instructor.lecture(students, numberOfHours);
        double expectedStudyTime = numberOfHours / students.length;

        for (Student s : students) {
            assertEquals(expectedStudyTime, s.getTotalStudyTime());
        }
    }

}