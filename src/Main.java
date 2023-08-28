import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //section_5_E1();
        section_5_E2();
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
}
