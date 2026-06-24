package main.ch01i18n;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormats {
    public static void main(String[] args) {
        double value = 123456.789;
        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.forLanguageTag("de-DE"));
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setRoundingMode(RoundingMode.HALF_UP); // most common. Other is HALF_EVEN for book keeping.
        System.out.println(numberFormat.format(value));
    }
}
