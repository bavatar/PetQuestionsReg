// String completion assignment
// The following code is supposed to ask the user their pet's name, breed and age.
// Add the 3 lines necessary to make this work...
// John Anderjaska
// 9-4-19

import java.util.Scanner;
public class PetQuestions {
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        String name;
        String breed;
        int age;

        System.out.print( "Greetings. What is your pet's name? " );
        name = keyboard.nextLine();

        System.out.print( "How old is " + name + "? ");
        age = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print( "What kind of animal is " + name + "? " );
        breed = keyboard.nextLine();

        System.out.println( name + " is your " + breed + " and it is " + age);
    }
}
