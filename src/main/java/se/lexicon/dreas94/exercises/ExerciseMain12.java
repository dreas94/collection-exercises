package se.lexicon.dreas94.exercises;

import java.util.HashMap;
import java.util.Map;

public class ExerciseMain12  implements Exercises
{
    public boolean runExercise()
    {
        System.out.println("12. Create a new class and call it Car. Add fields for Id,Brand and Model + getters and setters \n" +
                "Create a new hashMap of type <Integer,Car> and populate it with elements containing an \n" +
                "id(Integer) and a car object(Car). Lastly, print out only the car's brand.");
        Map<Integer,Car> hashMap = new HashMap<>();

        hashMap.put(123451, new Car("Volvo", "sfa"));
        hashMap.put(25476, new Car("Toyota", "sggawd"));
        hashMap.put(456753, new Car("Volkswagn", "dfgs"));
        hashMap.put(1474, new Car("Tesla","vbs"));

        for(Map.Entry<Integer,Car> m : hashMap.entrySet())
        {
            System.out.println(m.getValue().getBrand());
        }

        return true;
    }
}
