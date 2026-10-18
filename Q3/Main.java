
package Q3;

public class Main {
    public static void main(String[] args) {
        Result<Integer> result = new Result<>(75, 100);

        result.getMarks().ifPresent(
            marks -> System.out.println("Marks: " + marks)
        );

        System.out.println("Percentage: " + result.getPercentage() + "%");

        if (result.hasPassed(40)) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}
