import java.util.Scanner;

public class javaQuiz {
    public static void main(String[] args) {

        //JAVA QUIZ GAME
        String[] questions = {"1. What is the main function of a router ?",
                "2. Which part of the computer is considered the brain ?",
                "3. What year was facebook launched ?",
                "4. Who is known as the father of computers ?",
                "5. What was the first programming language"

        };

        String[][] options = {{"storing files", "data encryption", "directing traffic", "managing passwords"},
                {"1. cpu","2. memory", "3. gpu", "4. ssd"},
                {"1. 2020", "2. 2001", "3. 2005", "4. 2007"},
                {"1. babage", "2. newton", "3. einstein", "4. magellan"},
                {"1. cobol", "2. c++", "3. python", "4. fortran"}

        };

        int[] answers = {3,1,4,1,4};
        int score = 0;
        int guess;
        Scanner scanner = new Scanner(System.in);
        System.out.println("*************************");
        System.out.println("Welcome to Java Quiz Game !");
        System.out.println("*************************");

        for (int i =0; i< questions.length; i++){
            System.out.println(questions[i]);
            for (String option:options[i]){
                System.out.println(option);
            }
            System.out.print("Enter you guess: ");
            guess = scanner.nextInt();
            if(guess == answers[i]){
                System.out.println("*************");
                System.out.println("Correct");
                System.out.println("*************");
                score +=1;
            }
            else{
                System.out.println("Answer is Incorrect");
            }
        }


        scanner.close();
    System.out.printf("Score is: %d", score);
    }
}
