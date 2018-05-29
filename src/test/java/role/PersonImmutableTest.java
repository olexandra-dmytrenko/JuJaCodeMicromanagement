package role;

import org.testng.annotations.Test;

import java.util.Date;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

public class PersonImmutableTest {


    @Test
    public void testGetBirthdayImMutable() {
        PersonImmutable person = new PersonImmutable("Mary", "Fedkovich");
        assertNull(person.getBirthday());

        person.setBirthday(new Date(0L));
        assertEquals(person.getBirthday().getTime(), 0L);

        Date myVariableThatIWantToHaveMyDate = person.getBirthday();
        myVariableThatIWantToHaveMyDate.setTime(1L);

        assertEquals(person.getBirthday().getTime(), 0L);
    }
}