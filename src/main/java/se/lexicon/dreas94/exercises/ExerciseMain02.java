package se.lexicon.dreas94.exercises;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExerciseMain02
{
    public boolean runExercise()
    {
        System.out.println("2. Create a new list and populate it with the days of the week. Lastly, iterate through the list and print out each element separately");
        List<DayOfWeek> weekDays = new ArrayList<>();

        weekDays.add(DayOfWeek.MONDAY);
        weekDays.add(DayOfWeek.TUESDAY);
        weekDays.add(DayOfWeek.WEDNESDAY);
        weekDays.add(DayOfWeek.THURSDAY);
        weekDays.add(DayOfWeek.FRIDAY);
        weekDays.add(DayOfWeek.SATURDAY);
        weekDays.add(DayOfWeek.SUNDAY);

        Iterator<DayOfWeek> weekDayIterator = weekDays.iterator();

        while(weekDayIterator.hasNext())
            System.out.println(weekDayIterator.next());
        return true;
    }
}
