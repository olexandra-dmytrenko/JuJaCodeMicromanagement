package service;

import org.testng.annotations.Test;
import role.Student;

import static org.testng.Assert.*;

public class StudentActionsTest {

    @Test
    public void testGreet() {
        Student s = new Student("Anna", "Petrova");
        StudentActions actions = new StudentActions();
        String greet = actions.greet(s);
        assertEquals(greet, "Hi teacher");
    }
}