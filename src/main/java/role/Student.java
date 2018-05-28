package role;

import grading.WorkType;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Student extends Person{
    @Setter
    public double averageGrade;
    @Getter
    private Map<WorkType, Collection<Double>> grades;

    public Student(String firstName, String lastName) {
        super(firstName, lastName);
        grades = new HashMap<>();
    }
}
