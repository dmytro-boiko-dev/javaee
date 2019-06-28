//package quest;
//
//import java.util.Scanner;
//
//public class QuestMain {
//    public static void main(String[] args) {
//
//        boolean nextQuestion = false;
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Ты делаешь успехи, но рано радоваться.");
//        System.out.println("Сначала отгадай пару моих загадок.");
//        System.out.println("Загадка #1:");
//
//        while (nextQuestion == false){
//            askFirstQuestion();
//
//
//
//
//
//                askSecondQuestion();
//
//                String answer2 = "яма";
//                String ans2 = scanner.nextLine();
//                String ansLowerCase2 = ans2.toLowerCase();
//
//                boolean result2 = checkAnswer(ansLowerCase2, answer2);
//
//                if (result2 == true){
//                    System.out.println("Верно. Ты молодец.");
//                    System.out.println("Поздравляю, ты ответила на все загадки. Осталось забрать приз.");
//                    System.out.println("Он ждет тебя там, где вторая кон-ФЕТА.");
//                    break;
//                } else {
//                    System.out.println("Ответ не верный, попробуй еще раз.");
//                    askSecondQuestion();
//                    nextQuestion = false;
//                }
//
//            } else {
//                System.out.println("Ответ не верный, попробуй еще раз.");
//            }
//        }
//    }
//
//    private static boolean checkAnswer(String answerFromScanner, String correctAnswer){
//        if (answerFromScanner.equals(correctAnswer))
//            return true;
//
//        return false;
//    }
//
//    private boolean askFirstQuestion(){
//        System.out.println("Вот так чудо! Вот так диво!\n" +
//                "Как сорвался он с обрыва,\n" +
//                "так уже который год\n" +
//                "все никак не упадет.");
//        System.out.println("Введи ответ на русском и нажми Enter:");
//
//
//        Scanner scanner = new Scanner(System.in);
//        String answer1 = "водопад";
//        String ans1 = scanner.nextLine();
//        String ansLowerCase = ans1.toLowerCase();
//
//        boolean result1 = checkAnswer(ansLowerCase, answer1);
//
//        if (result1 == true){
//            System.out.println("Верно. Ты молодец.");
//            System.out.println("Тогда следующая загадка:");
//
//            return true;
//        }
//
//        return false;
//
//
//        }
//
//    private static void askSecondQuestion(){
//        System.out.println("Чем больше из неё берёшь, тем больше она становится.");
//        System.out.println("Введи ответ на русском и нажми Enter:");
//    }
//}
