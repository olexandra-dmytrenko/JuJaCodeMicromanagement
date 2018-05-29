package service;

import role.Person;
import role.Student;
import role.Teacher;

public class GeneralActions<P extends Person> implements Actions<P> {

    protected int numberOfInSchool;
    private static final String DEFAULT_MESSAGE = "";

    InnerGreetingClass greet(P person) {
        InnerGreetingClass innerGreetingClass = new InnerGreetingClass();
        innerGreetingClass.message = "Good morning";
        innerGreetingClass.formGreeting(person);
        return innerGreetingClass;
    }

    class InnerGreetingClass {

        protected String message;

        private void formGreeting(P person) {
            String output = message;
            //TODO: instanceOf looks ugly
            if (person instanceof Teacher) {
                output = output + " children. I'm " + getFullName(person) +
                        "There are " + numberOfInSchool + " of us.";
            } else if (person instanceof Student) {
                output = output + " teacher";
            }
            System.out.println(output);
        }
    }

    public String getFullName(P person) {
        return person.firstName + " " + person.lastName;
    }
}