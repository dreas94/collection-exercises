package se.lexicon.dreas94.exercises;

import java.time.DayOfWeek;
import java.util.*;

public class ExerciseMain08 implements Exercises
{
    public boolean runExercise()
    {
        System.out.println("8. Create a new hashSet and populate it with random names. Lasty, sort the names in alphabetical order using only a Set or a child of Set.");
        Set<String> names = new HashSet<>();

        names.add("Andreas");
        names.add("Tim");
        names.add("Carl");
        names.add("Ida");
        names.add("Bella");
        names.add("George");
        names.add("Curie");

        Set<String> namesArrList = new TreeSet<>(names);

        System.out.println(namesArrList);
        return true;
    }
}