package service;

import role.Person;
import role.Student;
import role.Teacher;

import static org.apache.commons.lang3.StringUtils.isBlank;

public class GeneralActions<P extends Person> implements Actions<P> {

    String greet(P person, String greetingMsg) {
        InnerGreetingClass innerGreetingClass = new InnerGreetingClass();
        innerGreetingClass.message = isBlank(greetingMsg) ? "Good morning" : greetingMsg;
        return innerGreetingClass.formGreeting(person);
    }

    protected int numberOfInSchool;
    private static final String DEFAULT_MESSAGE = "Not used";
    class InnerGreetingClass {

        protected String message;

        private String formGreeting(P person) {
            String output = message;
            //TODO: instanceOf looks ugly. So I've replaced it with getClass
            if (person.getClass().equals(Teacher.class)) {
                output = output + " children. I'm " + getFullName(person) +
                        ". There are " + numberOfInSchool + " of us.";
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