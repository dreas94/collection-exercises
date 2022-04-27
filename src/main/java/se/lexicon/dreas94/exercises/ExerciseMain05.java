package se.lexicon.dreas94.exercises;

import java.time.DayOfWeek;
import java.util.HashSet;
import java.util.Set;

public class ExerciseMain05 implements Exercises
{
    public boolean runExercise()
    {
        System.out.println("5. Create a new hashset and populate it with the days of the week. Lastly, print the set out and pay attention to the order of the elements.");
        Set<DayOfWeek> weekDays = new HashSet<>();

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
