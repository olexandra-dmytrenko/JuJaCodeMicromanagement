package service;

import grading.WorkType;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import role.Student;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class IStudentActionsTest {
    private static final List<Double> VALUEGOOD_GRADES = Arrays.asList(9.0, 11.0, 10.0);
    private Student wellStudent;

    @BeforeMethod
    public void setUp() {
        wellStudent = new Student("Anna", "StudiesWell");
    }

    @Test
    public void whenCountGPAForEmpty_shouldReturn0() {
        IStudentActions actions = new StudentActions();
        double actual = actions.countGPA(wellStudent);
        assertEquals(actual, 0.0);
    }

    @Test
    public void whenCountGPAForCLassRate_souldReturnRate() {
        wellStudent.getGrades().put(WorkType.CLASSWORK_RATE, VALUEGOOD_GRADES);
        IStudentActions actions = new StudentActions();
        double actual = actions.countGPA(wellStudent);
        assertEquals(actual, 10.0);
    }

    @Test
    public void whenCountGPAForTestRate_souldReturnRate() {
        wellStudent.getGrades().put(WorkType.TEST_RATE, VALUEGOOD_GRADES);
        IStudentActions actions = new StudentActions();
        double actual = actions.countGPA(wellStudent);
        assertEquals(actual, 12.0);
    }

    @Test
    public void whenCountGPAForHomeRate_souldReturnRate() {
        wellStudent.getGrades().put(WorkType.HOMEWORK_RATE, VALUEGOOD_GRADES);
        IStudentActions actions = new StudentActions();
        double actual = actions.countGPA(wellStudent);
        assertEquals(actual, 8.0);
    }

    @Test
    public void whenCountGPAForAllRates_souldReturnRate() {
        wellStudent.getGrades().put(WorkType.CLASSWORK_RATE, VALUEGOOD_GRADES);
        wellStudent.getGrades().put(WorkType.HOMEWORK_RATE, VALUEGOOD_GRADES);
        wellStudent.getGrades().put(WorkType.TEST_RATE, VALUEGOOD_GRADES);
        assert (wellStudent.getGrades().size() == 3);
        IStudentActions actions = new StudentActions();
        double actual = actions.countGPA(wellStudent);
        assertEquals(actual, 10.0);
    }
}