package grading;

import lombok.Getter;

public enum WorkType {
    CLASSWORK_RATE(1),
    HOMEWORK_RATE(0.8),
    TEST_RATE(1.2);

    @Getter
    double rate;

    WorkType(double rate) {
        this.rate = rate;
    }
}
