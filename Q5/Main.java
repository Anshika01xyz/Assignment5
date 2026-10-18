
package Q5;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        System.out.println("Strings equal: " + Utility.isEqual("Java", "Java"));
        System.out.println("Numbers equal: " + Utility.isEqual(10, 20));

        Optional<String> name = Optional.of("Anshika");
        Optional<String> emptyName = Optional.empty();

        System.out.println("Name: " + Utility.getDefault(name, "Guest"));
        System.out.println("Default name: " + Utility.getDefault(emptyName, "Guest"));

        System.out.println("Maximum number: " + Utility.max(25, 40));
        System.out.println("Maximum string: " + Utility.max("Apple", "Mango"));

        System.out.println("Is null: " + Utility.isNull(null));
        System.out.println("Is null: " + Utility.isNull("Anshika"));
    }
}
