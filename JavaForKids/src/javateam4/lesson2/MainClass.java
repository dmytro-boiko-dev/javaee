package javateam4.lesson2;

public class MainClass {
    public static void main(String[] args) {

        // Ctrl + Alt + L

        //Протосы
        double stalk = 13, darkhr = 24, kollos = 46;
        double attack1 = (stalk + darkhr + kollos) * 860;
        System.out.println("Общий показатель аттки Протосов: " + attack1);
        //Зерги
        double mutal = 9, ultra = 35, hydra = 12;
        //Зергов больше в 1,5 раз =>
        double res1 = 860 * 1.5;
        double attack2 = (mutal + ultra + hydra) * res1;
        System.out.println("Oбщий показатель Зергов: " + attack2);
        //Резуьтат и разница
        double res2 = attack2 - attack1;
        System.out.println("Зерги победили с результатом в: " + res2 + "!!!");


    }
}
