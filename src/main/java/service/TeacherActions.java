package service;

import role.Teacher;

public class TeacherActions extends GeneralActions<Teacher> {
    public int addYearToExperience(Teacher teacher){
        return teacher.experienceYears + 1;
    }
}
