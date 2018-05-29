package service;

import role.Student;

public class StudentActions extends GeneralActions<Student> implements IStudentActions {

    public String greet(Student s){
        return super.greet(s, "Hi");
    }
}