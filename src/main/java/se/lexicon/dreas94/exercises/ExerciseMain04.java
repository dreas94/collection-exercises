package se.lexicon.dreas94.exercises;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExerciseMain04 implements Exercises
{
    public boolean runExercise()
    {
        System.out.println("4. Create a new list and populate it with the days of the week. Then create a new list out of the first three elements of the first list using a subList.");
        List<DayOfWeek> weekDays = new ArrayList<>();

        weekDays.add(DayOfWeek.MONDAY);
        weekDays.add(DayOfWeek.TUESDAY);
        weekDays.add(DayOfWeek.WEDNESDAY);
        weekDays.add(DayOfWeek.THURSDAY);
        weekDays.add(DayOfWeek.FRIDAY);
        weekDays.add(DayOfWeek.SATURDAY);
        weekDays.add(DayOfWeek.SUNDAY);

        List<DayOfWeek> days = weekDays.subList(0, 3);

        System.out.println(days);
        return true;
    }
}