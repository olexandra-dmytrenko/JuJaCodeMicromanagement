import org.testng.annotations.Test;
import role.Person;
import role.Teacher;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class InstanceOfTest {

    @Test
    public void instanceOfAChild(){
        Person person = new Person("", "");
        Teacher teacher = new Teacher("", "");

        assertFalse(person instanceof Teacher);
        assertFalse(person.getClass().equals(Teacher.class));

        assertTrue(teacher instanceof Teacher);
        assertTrue(teacher.getClass().equals(Teacher.class));

        assertTrue(teacher instanceof Person);
        assertFalse(teacher.getClass().equals(Person.class));
    }
}