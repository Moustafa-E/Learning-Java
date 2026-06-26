package org.example.courseprocessor.models;

import java.time.LocalDate;

public class StartDateDurationAndTrainerName {

    private LocalDate startDate;
    private int numDays;
    private String trainerName;

    public StartDateDurationAndTrainerName(Course course) {
        startDate = course.getStartDate();
        numDays = course.getNumDays();
        trainerName = course.getTrainer().getFirstName() + " " + course.getTrainer().getLastName();
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public int getNumDays() {
        return numDays;
    }

    public void setNumDays(int numDays) {
        this.numDays = numDays;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }
}
