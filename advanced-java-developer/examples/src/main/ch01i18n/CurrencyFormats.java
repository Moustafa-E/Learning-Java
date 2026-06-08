package main.ch01i18n;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormats {
    public static void main(String[] args) {
        String langTagUk = "en-GB";
        String langTagFr = "fr-FR";

        double value = 12345.678;
        NumberFormat uk = NumberFormat.getCurrencyInstance(Locale.forLanguageTag(langTagUk));
        System.out.println(uk.format(value));
    }
}
