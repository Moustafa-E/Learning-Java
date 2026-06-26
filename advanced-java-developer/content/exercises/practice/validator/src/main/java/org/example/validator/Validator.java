package org.example.validator;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Validator {

    public Map<String, List<String>> validate(Object o, Class<?> myClass) throws IllegalAccessException {
        Map<String, List<String>> errors = new HashMap<>();
        for (Field field : myClass.getDeclaredFields()) {
            field.setAccessible(true);
            String fieldName = field.getName();
            Object fieldValue = field.get(o);
            Annotation[] annotations = field.getAnnotations();
            for (Annotation annotation : annotations) {
                // NotBlank validation
                if (annotation.annotationType() == NotBlank.class) {
                    if (fieldValue == null || ((String) fieldValue).isBlank()) {
                        addError(errors, fieldName, fieldName + " is blank");
                    }
                }
                // InRange validation
                if (annotation.annotationType() == InRange.class) {
                    InRange inRange = (InRange) annotation;
                    int min = inRange.min();
                    int max = inRange.max();
                    assert fieldValue != null;
                    double doubleField = Double.parseDouble(fieldValue.toString());
                    if (doubleField < min || doubleField > max) {
                        addError(errors, fieldName, fieldName + " is out of range");
                    }
                }
            }
        }
        return errors;
    }

    private void addError(Map<String, List<String>> errors, String fieldName, String errorMessage) {
        if (errors.containsKey(fieldName)) {
            errors.get(fieldName).add(errorMessage);
        } else {
            List<String> errorMessages = new ArrayList<>();
            errorMessages.add(errorMessage);
            errors.put(fieldName, errorMessages);
        }
    }

}
