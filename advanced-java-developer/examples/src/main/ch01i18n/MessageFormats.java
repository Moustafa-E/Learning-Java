package main.ch01i18n;

import java.text.MessageFormat;
import java.util.Locale;

public class MessageFormats {
    public static void main(String[] args) {
        MessageFormat messageFormat = new MessageFormat(
            "The price is {0, number, currency}", 
            Locale.forLanguageTag("sv-SE")
        );
        Object[] argument = new Object[]{375.0};
        System.out.println(messageFormat.format(argument));
    }
}
