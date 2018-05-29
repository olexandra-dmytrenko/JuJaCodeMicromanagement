package service;

import role.Person;
import role.Student;
import role.Teacher;

public class GeneralActions<P extends Person> implements Actions<P> {

    protected int numberOfInSchool;
    private static final String DEFAULT_MESSAGE = "Not used";

    String greet(P person, String greetingMsg) {
        InnerGreetingClass innerGreetingClass = new InnerGreetingClass();
        innerGreetingClass.message = "Good morning";
        return innerGreetingClass.formGreeting(person);
    }

    class InnerGreetingClass {

        protected String message;

        private String formGreeting(P person) {
            String output = message;
            //TODO: instanceOf looks ugly
            if (person instanceof Teacher) {
                output = output + " children. I'm " + getFullName(person) +
                        "There are " + numberOfInSchool + " of us.";
            } else if (person.getClass().equals(Student.class)) {
                output = output + " teacher";
            }
            System.out.println(output);
            return output;
        }
    }

    public String getFullName(P person) {
        return person.firstName + " " + person.lastName;
    }
}