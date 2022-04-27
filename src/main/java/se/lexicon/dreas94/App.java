package se.lexicon.dreas94;
import se.lexicon.dreas94.exercises.ExerciseMain01;
import se.lexicon.dreas94.exercises.ExerciseMain02;
import se.lexicon.dreas94.exercises.ExerciseMain03;
import se.lexicon.dreas94.exercises.ExerciseMain04;
import se.lexicon.dreas94.exercises.ExerciseMain05;
import se.lexicon.dreas94.exercises.ExerciseMain06;
import se.lexicon.dreas94.exercises.ExerciseMain07;
import se.lexicon.dreas94.exercises.ExerciseMain08;
import se.lexicon.dreas94.exercises.ExerciseMain09;
import se.lexicon.dreas94.exercises.ExerciseMain10;
import se.lexicon.dreas94.exercises.ExerciseMain11;
import se.lexicon.dreas94.exercises.ExerciseMain12;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        int choice;
        do
        {
            Scanner sc = new Scanner(System.in);
            do
            {
                choice = -1;
                System.out.println("--------------------------------------------------");
                System.out.print("Pick Exercise to run (1-16), 0 exits the program: ");
                if (sc.hasNextInt())
                {
                    choice = sc.nextInt();
                    if(choice != 0)
                        System.out.println("Running Exercise " + choice);
                    else
                        System.out.println("Exiting Program");
                }
                else {
                    System.out.println("That is not a number between 0-16, TRY AGAIN!");
                    sc.nextLine();
                }
            }
            while (choice == -1);

            System.out.println("--------------------------------------------------");

            boolean completed = false;

            switch(choice)
            {
                case 1:
                    //Completed
                    ExerciseMain01 exercise1 = new ExerciseMain01();
                    completed = exercise1.runExercise();
                    break;
                case 2:
                    //Completed
                    ExerciseMain02 exercise2 = new ExerciseMain02();
                    completed = exercise2.runExercise();
                    break;
                case 3:
                    //Completed
                    ExerciseMain03 exercise3 = new ExerciseMain03();
                    completed = exercise3.runExercise();
                    break;
                case 4:
                    //Completed
                    ExerciseMain04 exercise4 = new ExerciseMain04();
                    completed = exercise4.runExercise();
                    break;
                case 5:
                    //Completed
                    ExerciseMain05 exercise5 = new ExerciseMain05();
                    completed = exercise5.runExercise();
                    break;
                case 6:
                    //Completed
                    ExerciseMain06 exercise6 = new ExerciseMain06();
                    completed = exercise6.runExercise();
                    break;
                case 7:
                    //Completed
                    ExerciseMain07 exercise7 = new ExerciseMain07();
                    completed = exercise7.runExercise();
                    break;
                case 8:
                    //Completed
                    ExerciseMain08 exercise8 = new ExerciseMain08();
                    completed = exercise8.runExercise();
                    break;
                case 9:
                    //Completed
                    ExerciseMain09 exercise9 = new ExerciseMain09();
                    completed = exercise9.runExercise();
                    break;
                case 10:
                    //Completed
                    ExerciseMain10 exercise10 = new ExerciseMain10();
                    completed = exercise10.runExercise();
                    break;
                case 11:
                    //Completed
                    ExerciseMain11 exercise11 = new ExerciseMain11();
                    completed = exercise11.runExercise();
                    break;
                case 12:
                    //Completed
                    ExerciseMain12 exercise12 = new ExerciseMain12();
                    completed = exercise12.runExercise();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
            }
            if(completed)
                System.out.println("Exercise " + choice + " has finished.");
            else
                System.out.println("Exercise " + choice + " has not been completed. Try again later.");

            System.out.println("Returning to menu!");
        }while(choice != 0);
    }
}
