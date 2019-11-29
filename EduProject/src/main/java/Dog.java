public class Dog extends Animal {
    public static void main(String[] args) {

        String name = "Spoke";
        String breed = "Labrador";
        int age = 8;
        int paws = 4;
        boolean tail = true;

        run();
        bark();

        System.out.println("Собаку зовут " + name);
        System.out.println("У собаки " + paws + " лапы");
    }


    private static void run(){
        System.out.println("Собака бежит!");
    }

    private static void bark(){
        System.out.println("Собака гафкает: вуф! вуф!");
    }


}
