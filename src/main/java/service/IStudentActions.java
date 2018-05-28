package service;

import grading.WorkType;
import role.Student;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.stream.DoubleStream;

interface IStudentActions extends Actions<Student> {
    static Student updateGeneralGrade(Student student, double deltaGrade) {
        student.averageGrade = (student.averageGrade + deltaGrade) / 2;
        return student;
    }

    default double countGPA(Student student) {
        Map<WorkType, Collection<Double>> grades = Objects.requireNonNull(student.getGrades());
        double gPA = grades.entrySet().stream().flatMapToDouble(workTypeGrades ->
                DoubleStream.of(workTypeGrades.getKey().getRate()
                        * workTypeGrades.getValue().stream().mapToDouble(grade -> grade)
                        .peek(d -> System.out.println(d))
                        .average()
                        .orElse(0)))
                .peek(System.out::println)
                .average()
                .orElse(0);
        return gPA;
    }
}