package wildcards;

public class Coordinates<T extends TwoDim> {

    T[] coordinates;

    Coordinates(T[] obj){
        coordinates = obj;
    }
}
