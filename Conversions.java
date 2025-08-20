import java.util.Scanner;
/**
 * This application converts between various units of measurement.
 *
 * @author Tim Gesell
 * @version 8/20/2025
 */
public class Conversions
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Feet to Meters");
        System.out.println("4. Meters to Feet");
        System.out.println("5. Ounces to Milliliters");
        System.out.println("6. Milliliters to Ounces");
        //Add 2 more conversions, each both ways, to add choices 7, 8, 9, and 10.
        //You can add even more if you would like.

        int selection = keyboard.nextInt();
        keyboard.nextLine();  //go past the endline and be ready for more input

        if (selection == 1)
        {
            System.out.println("Enter Celsius: ");
            double celsius = keyboard.nextDouble();
            keyboard.nextLine();
            double fahrenheit = celsius * (9.0 / 5.0) + 32;
            System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit");
        }
        if (selection == 2)
        {
            System.out.println("Enter Fahrenheit: ");
            double fahrenheit = keyboard.nextDouble();
            keyboard.nextLine();
            double celsius = (fahrenheit - 32) * (9.0/5.0);
            System.out.println(fahrenheit + " degree fahrenheit is " + celsius + " degree celsius");
        }
         if (selection == 3)
        {
            System.out.println("Enter Feet: ");
            double Feet = keyboard.nextDouble();
            keyboard.nextLine();
            double Meters = Feet * 0.3048;
            System.out.println(Feet + " degree Feet is " + Meters + " Meters");
        }
        if (selection ==3)
        {
            System.out.println("Enter Feet: ");




        }
        
        





        }
        //add more if statements here.
    }
}


