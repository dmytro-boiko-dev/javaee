package hillel.java_vvp.hw_check.j3_hw.hw4;


public class MainCheck {
    public static void main(String[] args) {
        int [] teamMain = new int[25];
        teamMain[0] =(int)(Math.random() *100);
        teamMain[1] =(int)(Math.random() *100);
        teamMain[2] =(int)(Math.random() *100);
        teamMain[3] =(int)(Math.random() *100);
        teamMain[4] =(int)(Math.random() *100);
        teamMain[5] =(int)(Math.random() *100);
        teamMain[6] =(int)(Math.random() *100);
        teamMain[7] =(int)(Math.random() *100);
        teamMain[8] =(int)(Math.random() *100);
        teamMain[9] =(int)(Math.random() *100);
        teamMain[10] =(int)(Math.random() *100);
        teamMain[11] =(int)(Math.random() *100);
        teamMain[12] =(int)(Math.random() *100);
        teamMain[13] =(int)(Math.random() *100);
        teamMain[14] =(int)(Math.random() *100);
        teamMain[15] =(int)(Math.random() *100);
        teamMain[16] =(int)(Math.random() *100);
        teamMain[17] =(int)(Math.random() *100);
        teamMain[18] =(int)(Math.random() *100);
        teamMain[19] =(int)(Math.random() *100);
        teamMain[20] =(int)(Math.random() *100);
        teamMain[21] =(int)(Math.random() *100);
        teamMain[22] =(int)(Math.random() *100);
        teamMain[23] =(int)(Math.random() *100);
        teamMain[24] =(int)(Math.random() *100);
        for (int i = 0; i < teamMain.length; i++) {
            if (teamMain[i] <18 || teamMain[i] > 40) {
                for (int j = 0; j < 100; j++) {
                    int b = (int)(Math.random() *100);
                    if (b >= 18 && b <= 40) {
                        teamMain[i] = b;
                    }
                };
            }
            System.out.print( " "+ teamMain[i]);
        }
        System.out.println();
        int [] teamReserve = new int[25];
        teamReserve[0] =(int)(Math.random() *100);
        teamReserve[1] =(int)(Math.random() *100);
        teamReserve[2] =(int)(Math.random() *100);
        teamReserve[3] =(int)(Math.random() *100);
        teamReserve[4] =(int)(Math.random() *100);
        teamReserve[5] =(int)(Math.random() *100);
        teamReserve[6] =(int)(Math.random() *100);
        teamReserve[7] =(int)(Math.random() *100);
        teamReserve[8] =(int)(Math.random() *100);
        teamReserve[9] =(int)(Math.random() *100);
        teamReserve[10] =(int)(Math.random() *100);
        teamReserve[11] =(int)(Math.random() *100);
        teamReserve[12] =(int)(Math.random() *100);
        teamReserve[13] =(int)(Math.random() *100);
        teamReserve[14] =(int)(Math.random() *100);
        teamReserve[15] =(int)(Math.random() *100);
        teamReserve[16] =(int)(Math.random() *100);
        teamReserve[17] =(int)(Math.random() *100);
        teamReserve[18] =(int)(Math.random() *100);
        teamReserve[19] =(int)(Math.random() *100);
        teamReserve[20] =(int)(Math.random() *100);
        teamReserve[21] =(int)(Math.random() *100);
        teamReserve[22] =(int)(Math.random() *100);
        teamReserve[23] =(int)(Math.random() *100);
        teamReserve[24] =(int)(Math.random() *100);
        for (int i = 0; i < teamReserve.length; i++) {
            if (teamReserve[i] <18 || teamReserve[i] > 40) {
                for (int j = 0; j < 100; j++) {
                    int b = (int)(Math.random() *100);
                    if (b >= 18 && b <= 40) {
                        teamReserve[i] = b;
                    }
                }
            }

            System.out.print(" "+ teamReserve[i]);

        }
        System.out.println();
        int average1 = 0;
        int average2 = 0;
        for (int j : teamMain) {
            average1 = j + average1;
        }
        for (int i = 0; i < teamReserve.length; i++) {
            average2 = teamReserve[i] + average2;
        }
        average1 = average1/25;
        average2 = average2/25;

        if (average1 > average2) {
            System.out.println("Average age of the main team is more");
        } else if (average1 < average2) {
            System.out.println("Average age of the reserve team is more");
        } else {
            System.out.println("Average age of both team is the same ");
        }




    }
}