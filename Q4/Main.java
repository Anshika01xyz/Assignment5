
package Q4;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String eventName = "College Fest";
        LocalDate eventDate = LocalDate.of(2026, 12, 20);
        LocalTime startTime = LocalTime.of(10, 0);

        Optional<String> venue =
                Optional.of("College Auditorium");

        System.out.println("Event Name: " + eventName);
        System.out.println("Event Date: " + eventDate);
        System.out.println("Start Time: " + startTime);

        venue.ifPresentOrElse(
            v -> System.out.println("Venue: " + v),
            () -> System.out.println("Venue not specified")
        );

        LocalDate today = LocalDate.now();

        if (eventDate.isAfter(today)) {
            System.out.println("Event is in the future.");
        } else if (eventDate.isEqual(today)) {
            System.out.println("Event is today.");
        } else {
            System.out.println("Event is in the past.");
        }

        long daysRemaining =
                ChronoUnit.DAYS.between(today, eventDate);

        if (daysRemaining >= 0) {
            System.out.println(
                "Days remaining: " + daysRemaining
            );
        } else {
            System.out.println(
                "Days since event: " + (-daysRemaining)
            );
        }

        LocalTime endTime = startTime.plusHours(2);

        System.out.println("End Time: " + endTime);
    }
}
