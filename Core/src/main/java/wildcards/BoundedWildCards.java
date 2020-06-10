package wildcards;

public class BoundedWildCards {
    public static void main(String[] args) {

        TwoDim[] td = {
                new TwoDim(2,3),
                new TwoDim(-1,-3),
                new TwoDim(5,7)
        };

        Coordinates<TwoDim> tdlocks = new Coordinates<TwoDim>(td);

        System.out.println("Object tdlocks contains:");
        showXY(tdlocks);
        // showXYZ(tdlocks); // can't do this because of bounds
        // showXYZT(tdlocks); // can't do this because of bounds

        FourDim[] fd = {
          new FourDim(5,8,9,12),
          new FourDim(1,5,4,3),
          new FourDim(0,0,0,0),
          new FourDim(1,9,2,8)
        };

        Coordinates<FourDim> fdlocks = new Coordinates<FourDim>(fd);

        System.out.println("Object fdlocks contains:");
        showXY(fdlocks);
        showXYZ(fdlocks);
        showXYZT(fdlocks);
    }

    static void showXY(Coordinates<?> cords){
        System.out.println("Coordinates X and Y:");
        for (int i = 0; i < cords.coordinates.length; i++) {
            System.out.println(cords.coordinates[i].x + " " + cords.coordinates[i].y);
        }
        System.out.println();
    }

    static void showXYZ(Coordinates<? extends ThreeDim> cords){
        System.out.println("Coordinates X and Y and Z:");
        for (int i = 0; i < cords.coordinates.length; i++) {
            System.out.println(
                    cords.coordinates[i].x + " " +
                    cords.coordinates[i].y + " " +
                    cords.coordinates[i].z);
        }
        System.out.println();
    }

    static void showXYZT(Coordinates<? extends FourDim> cords){
        System.out.println("Coordinates X and Y and Z and T:");
        for (int i = 0; i < cords.coordinates.length; i++) {
            System.out.println(
                    cords.coordinates[i].x + " " +
                    cords.coordinates[i].y + " " +
                    cords.coordinates[i].z + " " +
                    cords.coordinates[i].t);
        }
        System.out.println();
    }

}
