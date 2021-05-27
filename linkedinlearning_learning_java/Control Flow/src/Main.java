import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Pick a number between 1 and 10");
        Scanner scanner = new Scanner(System.in);

        int inputtedNum = scanner.nextInt();

        if (inputtedNum < 5) {
            System.out.println("Enjoy the good luck a friend brings you");
        }
        else {
            System.out.println("Your shoe selection will make you very happy today");
        }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;
        while(isOnRepeat) {
            System.out.println("Playing current song");
            System.out.println("Would you like to take this song off of repeat? If so, answer yes");
            String userInput = input.next();

            if(userInput.equals("yes")) {
                isOnRepeat = false;
            }
        }
        System.out.println("Playing next song");

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        String question = "what is 6 divided by 1/2?";
        String choiceOne = "3";
        String choiceTwo = "12";
        String choiceThree = "6";

        String correctAnswer = choiceTwo;

        // Write a print statement asking the question
        System.out.println(question);
        // Write a print statement giving the answer choices
        System.out.println("Choose one of the following: " +
                choiceOne + ", " + choiceTwo + ", or " + choiceThree + ".");

        // Have the user input an answer
        Scanner userInput = new Scanner(System.in);
        // Retrieve the user's input
        int userAnswer = userInput.nextInt();

        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the user.
        if(userAnswer == 2) {
            System.out.println("Congrats, you go it right!");
        }

        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.
        else {
            System.out.println("Incorrect, the correct choice is " + choiceTwo);
        }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        String question1 = "What is the largest planet in our solar system?";
        String choiceOne1 = "earth";
        String choiceTwo1 = "jupiter";
        String choiceThree1 = "saturn";

        String correctAnswer1 = choiceTwo1;

        // Write a print statement asking the question
        System.out.println(question1);

        // Write a print statement giving the answer choices
        System.out.println("Choose one of the following: " +
                choiceOne1 + ", " + choiceTwo1 + ", or " + choiceThree1 + ".");

        // Have the user input an answer
        Scanner scanner1 = new Scanner(System.in);
        // Retrieve the user's input
        String input1 = scanner1.next();

        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the user.
        if(correctAnswer.equals(input1.toLowerCase())) {
            System.out.println("Congrats! That's the correct answer");
        } else {
            System.out.println("You are incorrect. The correct answer is " + correctAnswer1);
        }
        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.
    }
}
