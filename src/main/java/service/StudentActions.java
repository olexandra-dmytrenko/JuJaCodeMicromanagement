package service;

import role.Student;

public class StudentActions extends GeneralActions<Student> implements IStudentActions {

    @Override
    public InnerGreetingClass greet(Student s){
        //TODO: causes error, greet recurses instantly
        InnerGreetingClass greet = greet(s);
        greet.message = "Hi";
        return greet;
    }
}
