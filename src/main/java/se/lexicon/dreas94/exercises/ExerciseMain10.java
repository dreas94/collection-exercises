package se.lexicon.dreas94.exercises;

import java.util.HashMap;
import java.util.Map;

public class ExerciseMain10 implements Exercises
{
    public boolean runExercise()
    {
        System.out.println("10. Create a new hashMap of type <Integer,String> and populate it with elements containing an id(Integer) and a car brand(String). Lastly, print out only the keys.");
        Map<Integer,String> hashMap = new HashMap<>();

        hashMap.put(123451, "Volvo");
        hashMap.put(25476, "Toyota");
        hashMap.put(456753, "Volkswagn");
        hashMap.put(1474, "Tesla");

        for(Map.Entry<Integer,String> m : hashMap.entrySet())
            System.out.println(m.getKey());
        return true;
    }
}