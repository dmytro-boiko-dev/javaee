package javateam4.lesson2;

import java.util.Random;

public class MyCar {
    public static void main(String[] args) {

        int howManyStalker = 860;
        int howManyDarkTemplar = 860;
        int howManyColossus = 860;
        int vmeste = 860 * 3;

        int StalkerDamage = 13;
        int DarkTemplarDamage = 24;
        int ColossusDamage = 46;

        int quantityS = StalkerDamage * 860;
        int quantityD = DarkTemplarDamage * 860;
        int quantityC = ColossusDamage * 860;
        int generally = quantityS + quantityD + quantityC; //урон всех
        System.out.println(" Количество наших воинов - " + vmeste + ";");
        System.out.println(" Наш общий урон - " + generally + ".");

        //         ЗЕРГИ


        double howManyMutalisk = howManyStalker * 1.5;
        double howManyUltralisk = howManyDarkTemplar * 1.5;
        double howManyHydralisk = howManyColossus * 1.5;
        double generalyquality = howManyMutalisk + howManyHydralisk + howManyUltralisk;

        double MutaliskDamage = 9;
        double UltraliskDamage = 35;
        double HydraliskDamage = 12;

        double qualityM = howManyMutalisk*MutaliskDamage;
        double qualityU = howManyUltralisk*UltraliskDamage;
        double qualityH = howManyHydralisk*HydraliskDamage;
        double qualityDamage = qualityM+qualityH+qualityU;



        System.out.print(" Количество солдат противника - " + generalyquality + "!");
        System.out.println(" А их урон равен - " + qualityDamage + "!");
        System.out.print(" Нам стоит показать все свои возможности!!!");
        System.out.print(" Иначе мы примем поражение!!!");
        System.out.println(" В АТАКУ !!!");
        System.out.println(" *Крики воинов* ");


    }
}
