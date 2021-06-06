package hillel.java_vvp.hw_check.j3_hw.hw11.Sergey;

public class Lorries {
    public static void main(String[] args) {
        /* Все 50 грузовиков выезжают одновременно в пункт назначения.
        Как только объема в баках грузовиков становится достаточно для перекачки топлива из одного грузовика во
        все остальные, производится остановка и трасфер топлива, далее грузовик с пустым баком остается стоять и
        в перевозке участия более не принимает (груз везется соответсвенно только в одном грузовике, остальные
        едут как запас топлива.
        Неточностью в следствие перевода в двоичную и десятичную систему пренебрег */

        int lorries = 50;
        int distance = 0;
        double fuelTankFilled = 1.00;    // 1 - full, 0.5 - half, etc

        do {
            if (1 < fuelTankFilled * lorries / (lorries - 1)) {
                distance++;
                fuelTankFilled -= 0.01;
                System.out.printf("Distance covered: %s km\n", distance);
                System.out.printf("Fuel tank sounding, each truck: %.2f %s of volume\n", fuelTankFilled * 100,"%");
            } else {
                System.out.println("==============================================================================");
                System.out.println("STOP for fuel transfer...");
                fuelTankFilled = fuelTankFilled * lorries / --lorries;
                System.out.println("remaining lorries = " + lorries);
                System.out.println("==============================================================================");
            }
        } while (lorries > 1);

        System.out.println("LAST STOP for refueling...");
        distance += (int)(Math.ceil(fuelTankFilled * 100));
        System.out.println("Total distance covered (approximately) = " + distance + "km");

    }
}
