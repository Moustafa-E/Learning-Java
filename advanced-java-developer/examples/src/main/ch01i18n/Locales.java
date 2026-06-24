package main.ch01i18n;

import java.util.Locale;

public class Locales {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        System.out.println(Locale.forLanguageTag("fr-FR"));
        System.out.println(Locale.FRANCE);
        System.out.println(Locale.FRENCH);
        // arguments to setLanguage should be lower case. Methods don't care.
        System.out.println(
            new Locale.Builder()
                .setLanguage("cy")
                .setRegion("gb")
                .build()
        );
    }
}