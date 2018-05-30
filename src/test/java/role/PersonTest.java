package role;

import org.testng.annotations.Test;

import java.util.Date;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

public class PersonTest {

    @Test
    public void testGetBirthdayMutable() {
        Person person = new Person("Mary", "Fedkovich");
        assertNull(person.getBirthday());

        person.setBirthday(new Date(0L));
        assertEquals(person.getBirthday().getTime(), 0L);

        Date myVariableThatIWantToHaveMyDate = person.getBirthday();
        myVariableThatIWantToHaveMyDate.setTime(1L);

        assertEquals(person.getBirthday().getTime(), 1L);
    }

    @Test
    void testImmutableString(){
        String a = "123";
        String b = a.substring(1);
        assertEquals(a, "123");
        assertEquals(b, "23");
    }
}