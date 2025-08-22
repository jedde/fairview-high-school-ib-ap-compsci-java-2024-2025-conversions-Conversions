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
        System.out.println("7. Miles to Kilometers");
        System.out.println("8. Kilometers to Miles");
        System.out.println("9. Roblox studs to meters");
        System.out.println("10. Meters to Roblox studs");

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
            System.out.println(Feet + "Feet is " + Meters + " Meters");
        }
        if (selection == 4)
        {
            System.out.println("Enter Meters: ");
            double Meters = keyboard.nextDouble();
            keyboard.nextLine();
            double Feet = Meters * (1/0.3048);
            System.out.println(Meters + " Meters is " + Feet + " Feet");
        }
        if (selection == 5)
        {
            System.out.println("Enter Ounces:");
            double Ounces = keyboard.nextDouble();
            keyboard.nextLine();
            double Milliliters = Ounces * 29.5735;
            System.out.println(Ounces + " Ounces is " + Milliliters + " milliliters");

        }
        if (selection == 6)
        {
            System.out.println("Enter Milliliters:");
            double Milliliters = keyboard.nextDouble();
            keyboard.nextLine();
            double Ounces = Milliliters / 29.5735;
            System.out.println(Milliliters + " Milliliters is " + Ounces + "Ounces");
        }
        if (selection == 7)
        {
            System.out.println("Enter Miles:");
            Double Miles = keyboard.nextDouble();
            keyboard.nextLine();
            double Kilometers = Miles * 1.60934;
            System.out.println(Miles + " Miles is " + Kilometers + " Kilometers");
         }
        if (selection == 8)
        {
            System.out.println("Enter Kilometers: ");
            Double Kilometers = keyboard.nextDouble();
            keyboard.nextLine();
            Double Miles = Kilometers / 1.60934;
            System.out.println(Kilometers + " Kilometers is " + Miles + " Miles");

        }
        if (selection == 9)
        {
            System.out.println("Enter Roblox studs:");
            Double Studs = keyboard.nextDouble();
            keyboard.nextLine();
            Double Meters = Studs * 0.28/1;
            System.out.println(Studs + " Roblox studs is " + Meters + "Meters");

        }
        if (selection == 10)
        {
            System.out.println("Enter meters:");
            Double Meters = keyboard.nextDouble();
            keyboard.nextLine();
            Double Studs = Meters * 1/0.28;
            System.out.println(Meters + " Meters is " + Studs + " Roblox studs");



        }






        }
        //add more if statements here.
    }



