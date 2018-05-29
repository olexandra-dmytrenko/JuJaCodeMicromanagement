package service;

import org.testng.annotations.Test;
import role.Teacher;

import static org.testng.Assert.assertEquals;

public class GeneralActionsTest {

    @Test
    public void testGreet() {
        Teacher teacher = new Teacher("Maria", "Ivanovna");
        GeneralActions<Teacher> actions = new GeneralActions<>();
        String greet = actions.greet(teacher, "Hi");
        assertEquals(greet, "Good morning children. I'm Maria IvanovnaThere are 0 of us.");
    }
}