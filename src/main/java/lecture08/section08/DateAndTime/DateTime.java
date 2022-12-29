package lecture08.section08.DateAndTime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTime {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        LocalDateTime nowLDT = LocalDateTime.now(ZoneId.of("US/Pacific"));
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        Instant instant = Instant.now();

        System.out.println(now);
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(instant);

        System.out.println("*********************");
        System.out.println("*** US/Pacific  " + nowLDT + "  ***");
        System.out.println("*********************");
        // this method print all the zone id
        ZoneId.getAvailableZoneIds()
                .forEach(System.out::print);
        System.out.println("\n*********************");

        LocalDate someDate = LocalDate.of(2020,
                Month.AUGUST,
                28);

        System.out.println(
                someDate.minus(2,
                        ChronoUnit.DECADES));

        System.out.println(someDate.isBefore(now.toLocalDate()));

        System.out.println(
                someDate.minus(30,
                        ChronoUnit.DAYS));

        System.out.println("*********************" + "\n" + someDate.getYear() +
                "\n" + someDate.getDayOfMonth() +
                "\n" + someDate.getDayOfWeek());

    }
}
