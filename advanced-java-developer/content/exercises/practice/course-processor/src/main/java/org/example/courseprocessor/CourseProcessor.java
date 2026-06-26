package org.example.courseprocessor;

import org.example.courseprocessor.models.Course;
import org.example.courseprocessor.models.Person;
import org.example.courseprocessor.models.StartDateDurationAndTrainerName;

import java.util.List;
import java.util.OptionalDouble;

public class CourseProcessor {

    public static List<Course> getJavaCourses(List<Course> courses) {
        return courses.stream()
                .filter(course -> List.of("Java 1", "Java 2", "JEE", "Spring").contains(course.getName()))
                .toList();
    }

    public static List<StartDateDurationAndTrainerName> getTrainerAvailability(List<Course> courses) {
        return courses.stream()
                .map(StartDateDurationAndTrainerName::new)
                .toList();
    }

    public static List<StartDateDurationAndTrainerName> getTrainerAvailability(List<Course> courses, String trainerName) {
        return courses.stream()
                .filter(c -> trainerName.equals(c.getTrainer().getFirstName() + " " + c.getTrainer().getLastName()))
                .map(StartDateDurationAndTrainerName::new)
                .toList();
    }

    public static List<String> getDistinctCourseNames(List<Course> courses) {
        return courses.stream()
                .map(Course::getName)
                .distinct()
                .sorted()
                .toList();
    }

    public static List<Person> getDelegatesForCourse(List<Course> courses, String courseName) {
        return courses.stream()
                .filter(course -> course.getName().equals(courseName))
                .flatMap(course -> course.getDelegates().stream())
                .toList();
    }

    public static List<Course> getCoursesForDelegate(List<Course> courses, String delegateName) {
        return courses.stream()
                .filter(course -> course.getDelegates()
                        .stream()
                        .anyMatch(d -> delegateName.equals(d.getFirstName() + " " + d.getLastName())))
                .toList();
    }

    public static OptionalDouble getAverageNumberOfDelegatesForCourse(List<Course> courses, String courseName) {
        return courses.stream()
                .filter(course -> course.getName().equals(courseName))
                .mapToInt(course -> course.getDelegates().size())
                .average();
    }
 }
