package javateam4.lesson3;

public class Room {
    public static void main(String[] args) {

        int length = 20; // длина
        int width = 15; // ширина
        int height = 3; // высота

        int roomType = count(length, width, height);

        System.out.println("Square + type of the room = " + roomType);

    }

    public static int count(int a, int b, int c){
        int volume = a * b * c;
        return volume;
    }


}
