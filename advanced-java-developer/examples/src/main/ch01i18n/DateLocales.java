package main.ch01i18n;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Date;

public class DateLocales {
    // TODO: GET THIS WORKING WITH DATETIME
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
        System.out.println(
            dateTimeFormatter.withLocale(Locale.forLanguageTag("en-GB")).format(dateTime)
        );

        Date date2 = new Date();
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, Locale.forLanguageTag("fr-FR"));
        System.out.println(dateFormat.format(date2));
    }
}