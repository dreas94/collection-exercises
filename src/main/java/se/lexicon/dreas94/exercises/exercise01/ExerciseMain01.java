package se.lexicon.dreas94.exercises.exercise01;

import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.List;

public class ExerciseMain01
{
    public boolean runExercise()
    {
        List<String> weekDays = new ArrayList<>();

        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");

        System.out.println(weekDays);

        return true;
    }
}

