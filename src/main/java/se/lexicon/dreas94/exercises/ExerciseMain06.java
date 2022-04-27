package se.lexicon.dreas94.exercises;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ExerciseMain06 implements Exercises
{
    public boolean runExercise()
    {
        System.out.println("6. Create a new hashSet and populate it with the days of the week. Then convert the hashSet to an arrayList.");
        Set<DayOfWeek> weekDays = new HashSet<>();

        weekDays.add(DayOfWeek.MONDAY);
        weekDays.add(DayOfWeek.TUESDAY);
        weekDays.add(DayOfWeek.WEDNESDAY);
        weekDays.add(DayOfWeek.THURSDAY);
        weekDays.add(DayOfWeek.FRIDAY);
        weekDays.add(DayOfWeek.SATURDAY);
        weekDays.add(DayOfWeek.SUNDAY);

        ArrayList<DayOfWeek> weekDaysArrList = new ArrayList<>(weekDays);

        System.out.println(weekDaysArrList);
        return true;
    }
}
