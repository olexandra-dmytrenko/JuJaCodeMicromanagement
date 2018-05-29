package role;

import lombok.Setter;

import java.util.Date;

@Setter
public class PersonImmutable {
    @Setter
    public final String firstName;
    @Setter
    public final String lastName;
    @Setter
    private Date birthday;

    public Date getBirthday() {
        if (birthday != null) {
            return new Date(birthday.getTime());
        } else {
            return null;
        }
    }

    public PersonImmutable(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


}
