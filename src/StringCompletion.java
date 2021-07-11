import java.util.Scanner;

public class StringCompletion {
    public static void main(String [] args) {

        String name;
        String breed;
        int age;
        /*The following code is supposed to ask the user their pet's name, breed and age.
        Add the 3 lines necessary to make this work...*/

        Scanner keyboard = new Scanner(System.in); //1st important line

        System.out.print("Greetings. What is your pet's name? ");
        name = keyboard.next();

        System.out.print( "What kind of animal is " + name + "? ");
        breed = keyboard.next(); //2nd important line

        System.out.print( "How old is " + name + "?");
        age = keyboard.nextInt(); //third important line

        System.out.println( name + " is your " + breed + " and it is " + age + " years old");

    }
}
