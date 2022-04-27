package se.lexicon.dreas94.exercises;

import java.time.DayOfWeek;
import java.util.*;

public class ExerciseMain07 implements Exercises
{
    public boolean runExercise()
    {
        System.out.println("7. Create a new hashSet and populate it with random names. Then convert the hashSet to an arrayList. Lastly, manually sort the list in alphabetical order and print it out.");
        Set<String> names = new HashSet<>();

        names.add("Andreas");
        names.add("Tim");
        names.add("Carl");
        names.add("Ida");
        names.add("Bella");
        names.add("George");
        names.add("Curie");

        List<String> namesArrList = new ArrayList<>(names);

        System.out.println(namesArrList);

        Collections.sort(namesArrList);

        System.out.println(namesArrList);
        return true;
    }
}