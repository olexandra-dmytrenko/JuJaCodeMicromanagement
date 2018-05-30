package role;

import lombok.NonNull;
import lombok.Setter;

import java.util.Date;

public class PersonImmutable {

    public final String firstName;
    public final String lastName;
    @Setter
    @NonNull // If put on a parameter,
    // lombok will insert a null-check at the start of the method / constructor's body, throwing a
    // {@code NullPointerException} with the parameter's name as message
    private Date birthday;

    // Нельзя использовать геттер по умолчанию для модифицируемого mutable поля.
    // Необходимо сделать копирование поля, перед тем как его отдавать.
    // Иначе можно будет его изменить из вне, и запортить информацию в классе.
    // Смотри тесты. к классу Person and PersonImmutable

    public Date getBirthday() {
        if (birthday != null) {
            return new Date(birthday.getTime());
        } else {
            return null;
        }
    }

    public PersonImmutable(String firstName, String lastName) {
        assert (firstName != null); // альтернатива @NotNull.
        // Разница в ексепшине, который бросается. В случае assert - java.lang.AssertionError
        this.firstName = firstName;
        assert (lastName != null);
        this.lastName = lastName;
    }
}
