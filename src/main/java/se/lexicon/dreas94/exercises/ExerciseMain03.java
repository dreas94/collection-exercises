package se.lexicon.dreas94.exercises;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExerciseMain03 implements Exercises
{
    public boolean runExercise()
    {
        System.out.println("3. Create a new list and populate it with the days of the week excluding THURSDAY. Lastly, insert the weekday THURSDAY into the right position in the list.");
        List<DayOfWeek> weekDays = new ArrayList<>();

        weekDays.add(DayOfWeek.MONDAY);
        weekDays.add(DayOfWeek.TUESDAY);
        weekDays.add(DayOfWeek.WEDNESDAY);
        weekDays.add(DayOfWeek.FRIDAY);
        weekDays.add(DayOfWeek.SATURDAY);
        weekDays.add(DayOfWeek.SUNDAY);

        Iterator<DayOfWeek> weekDayIterator = weekDays.iterator();

        while(weekDayIterator.hasNext())
            System.out.println(weekDayIterator.next());

        System.out.println("----");
        weekDays.add(weekDays.indexOf(DayOfWeek.WEDNESDAY)+1, DayOfWeek.THURSDAY);

        weekDayIterator = weekDays.iterator();

        while(weekDayIterator.hasNext())
            System.out.println(weekDayIterator.next());
        return true;
    }
}
