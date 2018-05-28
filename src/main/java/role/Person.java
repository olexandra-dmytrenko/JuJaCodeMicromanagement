package role;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
public class Person {
    public String firstName;
    public String lastName;
    @Getter
    private Date birthday;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
