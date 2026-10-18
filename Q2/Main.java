
package Q2;

import java.util.Optional;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {

        Optional<String> email =
                Optional.of("student@gmail.com");

        Optional<String> emptyEmail = Optional.empty();

        System.out.println("Email address:");
        email.ifPresent(System.out::println);

        String defaultEmail =
                emptyEmail.orElse("default@gmail.com");

        System.out.println("Default email: " + defaultEmail);

        try {
            String missingEmail = emptyEmail.orElseThrow(
                () -> new NoSuchElementException("Email not found")
            );

            System.out.println(missingEmail);
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }
}
