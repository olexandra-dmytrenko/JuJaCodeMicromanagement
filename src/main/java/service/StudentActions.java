package service;

import role.Student;

public class StudentActions extends GeneralActions<Student> implements IStudentActions {

    @Override
    public String greet(Student s, String greetingMsg){
        //TODO: causes error, greet recurses instantly
        return super.greet(s, "Hi");
    }
}