
package Q3;

import java.util.Objects;
import java.util.Optional;

public class Result<T extends Number> {
    private T marks;
    private double maximumMarks;

    public Result(T marks, double maximumMarks) {
        this.marks = Objects.requireNonNull(
            marks, "Marks cannot be null"
        );

        if (maximumMarks <= 0) {
            throw new IllegalArgumentException(
                "Maximum marks must be positive"
            );
        }

        this.maximumMarks = maximumMarks;
    }

    public double getPercentage() {
        return (marks.doubleValue() / maximumMarks) * 100;
    }

    public boolean hasPassed(double threshold) {
        return getPercentage() >= threshold;
    }

    public Optional<T> getMarks() {
        return Optional.ofNullable(marks);
    }
}
