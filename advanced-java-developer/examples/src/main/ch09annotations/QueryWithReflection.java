package ch09annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Arrays;

public class QueryWithReflection {

    public static void main(String[] args) {

        Class<Match> matchClass = Match.class;
        Field[] privateFields = matchClass.getDeclaredFields();
        Constructor<?>[] constructors = matchClass.getConstructors();
        Annotation[] annotations = matchClass.getAnnotations();

        System.out.println("Private fields");
        Arrays.stream(privateFields).forEach(System.out::println);
        System.out.println("Constructors");
        Arrays.stream(constructors).forEach(System.out::println);
        System.out.println("Annotations");
        for (Annotation a : annotations) {
            System.out.println(a);
            System.out.println(((Author)a).name());
            System.out.println(((Author)a).company());
        }

    }
}
