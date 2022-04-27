package se.lexicon.dreas94.exercises;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

public class ExerciseMain01 implements Exercises
{
    public boolean runExercise()
    {
        System.out.println("1. Create a new list and populate it with the days of the week. Lastly, print the out the list");
        List<DayOfWeek> weekDays = new ArrayList<>();

        weekDays.add(DayOfWeek.MONDAY);
        weekDays.add(DayOfWeek.TUESDAY);
        weekDays.add(DayOfWeek.WEDNESDAY);
        weekDays.add(DayOfWeek.THURSDAY);
        weekDays.add(DayOfWeek.FRIDAY);
        weekDays.add(DayOfWeek.SATURDAY);
        weekDays.add(DayOfWeek.SUNDAY);

        System.out.println(weekDays);

        return true;
    }
}

