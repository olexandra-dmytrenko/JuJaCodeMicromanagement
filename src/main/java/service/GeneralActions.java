package service;

import role.Person;

public class GeneralActions<P extends Person> implements Actions<P> {

    public String getFullName(P person) {
        return person.firstName + " " + person.lastName;
    }
}
