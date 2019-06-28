package quest;

import java.util.Scanner;

public class NewQuest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ты делаешь успехи, но рано радоваться.");
        System.out.println("Ответь на один вопрос");
        System.out.println("Are you little bear?");

        String answer1 = "yes";
        String ans1 = scanner.nextLine();
        String ansLowerCase = ans1.toLowerCase();

        boolean result1 = checkAnswer(ansLowerCase, answer1);

        if (result1 == true) {
            System.out.println("Поздравляю, ты ответила верно. Осталось забрать приз.");
            System.out.println("Он ждет тебя там, где вторая кон-ФЕТА.");
        } else {
            System.out.println("Попробуй снова:");

            String answer2 = "yes";
            String ans2 = scanner.nextLine();
            String ansLowerCase2 = ans2.toLowerCase();

            boolean result2 = checkAnswer(ansLowerCase2, answer2);
            if (result2 == true) {
                System.out.println("Поздравляю, ты ответила верно. Осталось забрать приз.");
                System.out.println("Он ждет тебя там, где вторая кон-ФЕТА.");
            }

        }
    }

        private static boolean checkAnswer(String answerFromScanner, String correctAnswer){
        if (answerFromScanner.equals(correctAnswer))
            return true;

        return false;
    }
}
