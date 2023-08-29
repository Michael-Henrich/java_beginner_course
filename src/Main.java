import java.io.IOException;
import java.sql.Array;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        guestList();
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

    public static void section_7_E1(){
        for(int i = 89; i<118; i++){
            System.out.println(i);
        }
    }

    public static void section_7_E2(){
        for(int i = 1; i<41; i++){

            System.out.print(i);
            if(i % 3 == 0){
                System.out.print(" Quack");
            }
            System.out.println();
        }
    }

    public static void section_7_E3(){
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter password");
        do{

            String password = scanner.next();

            if(password.equals("shark50")){
                System.out.println("ACCESS APPROVED");
                break;
            }else{
                System.out.println("Try again...");
            }
        }while(true);
    }

    public static void section_7_E4(){
        for(int i=0; i<11; i++){
            if(i<10){
                System.out.print(i+", ");
            }else{
                System.out.print(i+".");
            }
        }
    }

    public static void section_8_E1(){
        int[] sortedNumbers = {1,2,3,4,5,6,7,8,9,10};

        for(int number : sortedNumbers){
            System.out.println(number);
        }
    }

    public static void section_8_E2(){
        int[] sortedNumbers = new int[20];

        for(int i=0; i<20; i++){
            sortedNumbers[i] = i+1;
        }

        for(int i=19; i>=0; i--){
            System.out.println(sortedNumbers[i]);
        }
    }

    public static void section_8_E3(){
        double[] intArr = new double[5];
        intArr[0] = 12.397;
        intArr[1] = 5346.3;
        intArr[2] = 90;
        intArr[3] = 6.58;
        intArr[4] = 368.11;

        double sum = 0;
        for (int i = 0; i < intArr.length; i++) {
            sum += intArr[i];
        }

        double mean = sum / intArr.length;

        System.out.println("Sum: " + sum);
        System.out.println("Mean: " + mean);
    }

    public static void section_8_E4(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your top five favourite foods.\n");

        String[] foods = new String[3];
        for (int i = 0; i < foods.length; i++) {
            System.out.print("Food " + (i + 1) + ": ");
            foods[i] = scanner.nextLine();
        }
        System.out.println("No more memory available.\n");

        System.out.println("Your favourite foods are: ");
        for (int i = 0; i < foods.length; i++) {
            System.out.println(" - " + foods[i]);
        }
    }

    public static void section_10_Prime(){
        for(int num = 2; num < 20; num++){
            boolean isPrime = true;
            for(int div = 2 ; div * div <= num; div++){
                if(num % div == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                System.out.println(num);
            }
        }
    }

    //Student exam results
    public static void section_10_E1(){
        Scanner scanner = new Scanner(System.in);

        Dictionary<String,Double> examResults = new Hashtable<String,Double>();


        Boolean hasMoreStudents = true;
        do{
            System.out.println("Please enter the students name");
            String studentName = scanner.next();
            System.out.println("Please enter the score of: " + studentName);
            Double studentScore = scanner.nextDouble();
            examResults.put(studentName,studentScore);


            System.out.println("Do you wish to enter another student? (y/n)");
            String addAnotherStudent = scanner.next();
            if(addAnotherStudent.equals("y")){
                hasMoreStudents = true;
            }else if(addAnotherStudent.equals("n")){
                hasMoreStudents = false;
            }
        }while(hasMoreStudents);

        Double mean = 0.0;
        Iterator<String> iter = examResults.keys().asIterator();

        while(iter.hasNext()){
            String studentName = iter.next();
            System.out.println(studentName + ": " + examResults.get(studentName));
            mean += examResults.get(studentName);
        }


        System.out.println("Mean of the exam was: " + mean / examResults.size());
    }

    public static void section_10_E2(){
        Scanner scanner = new Scanner(System.in);
        String[] questions = {
                "Fire is hot",
                "The earth is flat",
                "God is real",
                "1 + 1 equals 2",
                "Are you currently looking at a screen?"
        };
        Boolean[] correctAnswers = {true,false,false,true,true};
        Boolean[] userAnswers = new Boolean[5];

        System.out.println("Please answer the following questions with true or false");

        for(int i=0; i<questions.length; i++){
            System.out.println(questions[i]);
            userAnswers[i] = scanner.nextBoolean();
        }

        Integer userScore = 0;
        for(int i=0; i<correctAnswers.length; i++){
            if(correctAnswers[i] == userAnswers[i]){
                userScore++;
            }
        }

        System.out.println("Nice, you got " + userScore + " correct answers!");
    }

    public static void section_10_E3(){
        Scanner scanner = new Scanner(System.in);
        Integer userNumber = 0;
        Integer pickedNumber = 0;

        Integer min = 1;
        Integer max = 101;
        Integer attempts = 0;

        System.out.println("Please pick a number between 1 and 100, i will attempt to guess it!");
        userNumber = scanner.nextInt();

        do{
            int randomNumber = ThreadLocalRandom.current().nextInt(min, max);
            System.out.println("Attempt " + attempts + "! Let me guess, your number is " + randomNumber + " ?");

            //The task seemed boring so i automated the cycles instead of having user inputs
            if(randomNumber > userNumber){
                System.out.println("So your number is lower than " + randomNumber + ", eh? That will make it quick!");
                max = randomNumber;
            }else if(randomNumber < userNumber){
                System.out.println("So your number is actually higher than " + randomNumber + ". Very interesting, let me try again");
                min = randomNumber;
            }

            pickedNumber = randomNumber;
            ++attempts;
        }while(!pickedNumber.equals(userNumber));
        System.out.println("Gotcha! Your number was " + pickedNumber + "! Only took me " + attempts + " tries to get it right, too easy!");
    }

    public static void section_10_E4(){
        Scanner scanner = new Scanner(System.in);
        Integer userNumber = 0;
        Integer pickedNumber = 0;

        Integer min = 1;
        Integer max = 101;
        Integer attempts = 0;

        System.out.println("Please pick a number between 1 and 100, i will attempt to guess it!");
        userNumber = scanner.nextInt();

        do{
            int randomNumber = (max+min) / 2;
            System.out.println("Attempt " + attempts + "! Let me guess, your number is " + randomNumber + " ?");

            //The task seemed boring so i automated the cycles instead of having user inputs
            if(randomNumber > userNumber){
                System.out.println("So your number is lower than " + randomNumber + ", eh? That will make it quick!");
                max = randomNumber;
            }else if(randomNumber < userNumber){
                System.out.println("So your number is actually higher than " + randomNumber + ". Very interesting, let me try again");
                min = randomNumber;
            }

            pickedNumber = randomNumber;
            ++attempts;
        }while(!pickedNumber.equals(userNumber));
        System.out.println("Gotcha! Your number was " + pickedNumber + "! Only took me " + attempts + " tries to get it right, too easy!");
    }


    public static void ticTacToe() {
        Scanner scanner = new Scanner(System.in);

        String logicBoard[][] = {
                {" ", " ", " "},
                {" ", " ", " "},
                {" ", " ", " "}
        };


        boolean gameFinished = false;
        int turn = 0;
        String currentPlayer = "X";
        do{
            System.out.println(" "+logicBoard[0][0]+" | "+logicBoard[0][1]+" | "+logicBoard[0][2]+" ");
            System.out.println("---+---+---");
            System.out.println(" "+logicBoard[1][0]+" | "+logicBoard[1][1]+" | "+logicBoard[1][2]+" ");
            System.out.println("---+---+---");
            System.out.println(" "+logicBoard[2][0]+" | "+logicBoard[2][1]+" | "+logicBoard[2][2]+" ");

            System.out.print ("Turn for");
            if(turn % 2 == 0){
                currentPlayer = "X";
                System.out.print(" X\n");
            }else{
                currentPlayer = "O";
                System.out.print(" O\n");
            }




            System.out.println("Enter x position");
            int xPos = scanner.nextInt();
            System.out.println("Enter y position");
            int yPos = scanner.nextInt();

            if(logicBoard[xPos][yPos].equals(" ")){
                logicBoard[xPos][yPos] = currentPlayer;
                System.out.println(logicBoard[xPos][yPos]);
            }else{
                System.out.println("choose a different position");
            }

            ++turn;

            if(
                                    logicBoard[0][0].equals(currentPlayer) && logicBoard[0][1].equals(currentPlayer) && logicBoard[0][2].equals(currentPlayer) ||
                                    logicBoard[1][0].equals(currentPlayer) && logicBoard[1][1].equals(currentPlayer) && logicBoard[1][2].equals(currentPlayer) ||
                                            logicBoard[2][0].equals(currentPlayer) && logicBoard[2][1].equals(currentPlayer) && logicBoard[2][2].equals(currentPlayer) ||
                                            logicBoard[0][0].equals(currentPlayer) && logicBoard[1][1].equals(currentPlayer) && logicBoard[2][2].equals(currentPlayer) ||
                                            logicBoard[2][0].equals(currentPlayer) && logicBoard[1][1].equals(currentPlayer) && logicBoard[0][2].equals(currentPlayer) ||
                                            logicBoard[0][0].equals(currentPlayer) && logicBoard[1][0].equals(currentPlayer) && logicBoard[2][0].equals(currentPlayer) ||
                                            logicBoard[0][1].equals(currentPlayer) && logicBoard[1][1].equals(currentPlayer) && logicBoard[2][1].equals(currentPlayer) ||
                                            logicBoard[0][2].equals(currentPlayer) && logicBoard[1][2].equals(currentPlayer) && logicBoard[2][2].equals(currentPlayer)
            ) {
                gameFinished = true;
            }
        }while(!gameFinished);


        System.out.println(" "+logicBoard[0][0]+" | "+logicBoard[0][1]+" | "+logicBoard[0][2]+" ");
        System.out.println("---+---+---");
        System.out.println(" "+logicBoard[1][0]+" | "+logicBoard[1][1]+" | "+logicBoard[1][2]+" ");
        System.out.println("---+---+---");
        System.out.println(" "+logicBoard[2][0]+" | "+logicBoard[2][1]+" | "+logicBoard[2][2]+" ");
        System.out.println("Winner is player " + currentPlayer + " !!!");
    }

    public static void guestList(){
        Integer hotelCapacity = 10;
        String[] guests = new String[hotelCapacity];
        Scanner scanner = new Scanner(System.in);
        insertTestGuests(guests);

        do{
            displayGuests(guests);
            displayMenu();
            int option = getOption();
            System.out.println();

            if(option == 1){
                addGuest(guests);
            }else if(option == 2){
                System.out.print("Guest Number: ");
                Integer number = scanner.nextInt();
                removeGuest(number,guests);
            }else if(option == 3){
                renameGuest(guests);
            }else if(option == 4){
                System.out.print("Insert before Guest Nr. ");
                int number = scanner.nextInt();
                System.out.print("Name of new Guest: ");
                scanner.nextLine();
                String guestName = scanner.nextLine();
                insertGuest(guests,number,guestName,hotelCapacity);
            }
            else if (option == 5){
                System.out.println("Exiting ...");
                break;
            }
        }while(true);
    }

    public static void displayGuests(String[] guests){
        System.out.println("______________________________\n- Guests - \n");
        if(guests[0] == null){
            System.out.println("Guest list is empty");
            return;
        }


        for(int i=0; i< guests.length; i++){
            if(guests[i] != null){
                System.out.print(i+1 +". ");
                System.out.println(guests[i]);
            }
        }
    }

    public static void displayMenu(){
        System.out.println("______________________________\n- Menu - \n");
        System.out.println("1 - Add Guest");
        System.out.println("2 - Remove Guest");
        System.out.println("3 - Rename Guest");
        System.out.println("4 - Insert Guest before...");
        System.out.println("5 - Exit");
    }

    public static Integer getOption(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Option: ");
        int option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }

    public static void addGuest(String[] guests){
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i< guests.length; i++){
            if(guests[i] == null){
                System.out.println("Name: ");
                guests[i] = scanner.nextLine();
                break;
            }
        }
    }

    public static void removeGuest(Integer number,String[] guests){
        boolean guestRemoved = false;
        for(int i=number-1; i< guests.length; i++){
            if(guests[i] != null && number-1 == i){
                guestRemoved = true;
            }
            if(guestRemoved && i+1 < guests.length){
                guests[i] = guests[i+1];
            }
        }

        if(!guestRemoved){
            System.out.println("No guest with this number exists, please enter a valid number");
        }
    }

    public static String[] insertTestGuests(String[] guests){
        guests[0] = "Jacob";
        guests[1] = "Edward";
        guests[2] = "Rose";
        guests[3] = "Michael";
        guests[4] = "Tinny";
        guests[5] = "Robert";
        return guests;
    }

    public static void renameGuest(String[] guests){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Guest Nmuber: ");
        Integer number = scanner.nextInt();
        System.out.print("New name: ");
        //Catching the enter after inserting the number
        scanner.nextLine();
        String newName = scanner.nextLine();

        guests[number-1] = newName;
    }

    public static void insertGuest(String[] guests,Integer number, String guestName,Integer hotelCapacity){
        for(int i= hotelCapacity-1; i >= number; i--){
            if(number == i){
                guests[i] = guestName;
            }
            if(i > number){
                guests[i] = guests[i-1];
            }else{
                System.out.println("CAUTION, no more space available to insert new guests!");
            }
        }
    }
}
