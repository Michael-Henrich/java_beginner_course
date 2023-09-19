import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        randomNumberExample(scanner);

    }

    public static void makePatientList(){
        Patient patient1 = new Patient(20,"Tom");
        Patient patient2 = new Patient();


        List<Patient> patientList = new ArrayList<>();

        patientList.add(patient1);
        patientList.add(patient2);
        patientList.add(new Patient(10,"Peter"));

        patientList.forEach(patient -> {
            System.out.println(patient);
        });

        System.out.println("\n");
        //Saved the list after filter operation
        List<Patient> secondList = patientList.stream().filter(patient ->{
            return patient.getAge() >= 10;
        }).toList();

        //Instead of a forEach loop there is a "lambda" annotation that can acccept one parameter
        secondList.forEach(patient -> {
            System.out.println(patient);
        });

        //This is the same as above with the lambda annotation
        secondList.forEach(System.out::println);
    }

    public static void  simpleArrayAndListExample(){
        int[] oneToFive = {1,2,3,4,5};
        int[] alternative = new int[5];
        alternative[0] = 1;

        List<Integer> myList = new ArrayList<Integer>();

        myList.add(1);
        myList.add(10);
        myList.add(5);
        myList.add(1,22);
        myList.forEach(i -> {
            System.out.println(i);
        });

        //Iterate over the array with helper function
        Arrays.stream(oneToFive).asLongStream().forEach(nummer -> {
            System.out.println(nummer);
        });

        //Same functionality in a for loop
        for(int i=0; i<oneToFive.length; i++){
            System.out.println(oneToFive[i]);
        }



        for(int i=0; i<5; i++){
            System.out.println(oneToFive[i]);
        }
    }

    public static void randomNumberExample(Scanner scanner){
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
        int value;
        System.out.println("Please guess a number between 1 and 100:");


        do {
            value = scanner.nextInt();
            if (value < randomNumber) {
                System.out.println("HIGHER:");
            } else if(value > randomNumber){
                System.out.println("LOWER:");
            }
        } while (value != randomNumber);

        System.out.println("Correct number");
    }

    public static void enterNumberBetweenOneAndTen(Scanner scanner){
        int max = 20;
        for(int i = 0; i <= max; i++){
            //Compact if else works like this:   condition ? positivePath : negativePath;
            //System.out.print(i==max ? i+"." : i+",");


            if(i==max){
                System.out.print(i+".");
            }else{
                System.out.print(i+",");
            }
        }
        int userInput = scanner.nextInt();
        while(userInput > 10 || userInput < 1 ){
            System.out.println("Number not within 1 and 10\n Try again:");
            userInput = scanner.nextInt();
        }
        System.out.println("Number within 1 and 10");
    }

    public static String e6_conditionalStatements(){
        String userName = "Michael";
        if(userName.equals("Michael")){
            System.out.println(userName);
        }else {
            System.out.println("Name is not the same");
        }


        int zahl = 10;
        switch(zahl){
            case 1:
                System.out.println("Zahl ist 1");
                break;
            case 3:
                System.out.println("Zahl ist 3");
                break;
            case 4:
                System.out.println("Zahl ist 4");
                break;
            default:
                System.out.println("Nummer stimmt nicht mit Optionen überein");
        }

        boolean userHasPermission = true;
        boolean userIsAdmin = false;

        if(!userHasPermission){
            return "You don't have any permission";
        }

        if(userIsAdmin){
            return "Welcome admin";
        }else{
            return "Welcome user";
        }
    }
}
