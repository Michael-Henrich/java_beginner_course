import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        System.out.println(section_6_E4());
    }


    public static void section_5_E1(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.println();
        System.out.println("You've lived " + age + " years. In another " + age + " years you'll be " + 2*age + " years old");
        System.out.println("Your name is a total of " + firstName.length() + " letters long");
    }

    public static void section_5_E2(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Amount of people at the table: ");
        Integer peopleCount = scanner.nextInt();

        System.out.print("Restaurant bill: ");
        Double bill = scanner.nextDouble();

        System.out.print("The bill amounts to " + bill + " and there are " + peopleCount + " people at the table. Everyone has to pay");
        System.out.format(" %.2f" , bill / peopleCount);
        System.out.print(" Leave a tip ;)");
    }


    public static String section_6_E1(){
        int x = 23;
        int y = 12;

        if(x == y)
            return "x and y are the same";

        if(x > y)
            return "x is greater than y";

        if(x < y)
            return "x is smaller than y";

        return "can't compare x and y";
    }
    public static String section_6_E2(){
        int x = 23;
        int y = 12;

        if(x == y)
            return "x and y are the same";

        if(x > y)
            return "x is " + (x-y) +" greater than y";

        if(x < y)
            return "x is " + (y-x) + " smaller than y";

        return "can't compare x and y";
    }

    public static String section_6_E3(){
        Scanner scanner = new Scanner(System.in);
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);

        System.out.println("Pick a number between 1 and 5");
        int pickedNumber = scanner.nextInt();

        if(pickedNumber == randomNumber){
            return "Correct! Aren't you lucky.";
        }else{
            return "Hard luck! Maybe next time";
        }

    }

    public static String section_6_E4(){
        Scanner scanner = new Scanner(System.in);
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);

        System.out.println("Pick two numbers between 1 and 5");
        int pickedNumber = scanner.nextInt();
        int pickedNumber2 = scanner.nextInt();

        if(pickedNumber == randomNumber || pickedNumber2 == randomNumber){
            return "Correct! Aren't you lucky.";
        }else{
            return "Hard luck! Maybe next time";
        }

    }
}
