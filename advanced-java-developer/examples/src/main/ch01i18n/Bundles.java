package main.ch01i18n;

import java.util.Locale;
import java.util.ResourceBundle;

public class Bundles {
    public static void main(String[] args) {
        // <project-name>/src/translate_fr.properties is needed to actually translate the words.
        Locale france = Locale.forLanguageTag("fr-FR");
        ResourceBundle bundle = ResourceBundle.getBundle("translate", france);
        System.out.println("Page title " + bundle.getString("welcome"));
        System.out.println("Submit button " + bundle.getString("submit"));
    }
}
