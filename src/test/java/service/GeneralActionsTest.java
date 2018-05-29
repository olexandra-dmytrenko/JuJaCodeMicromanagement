package service;

import org.testng.annotations.Test;
import role.Teacher;

import static org.testng.Assert.assertEquals;

public class GeneralActionsTest {
    @Test
    public void testGreet() {
        Teacher teacher = new Teacher("Maria", "Ivanovna");
        GeneralActions<Teacher> actions = new GeneralActions<>();
        GeneralActions<Teacher>.InnerGreetingClass greet = actions.greet(teacher);
        assertEquals(greet.message, "Good morning");
    }
}